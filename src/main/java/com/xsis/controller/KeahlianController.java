package com.xsis.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xsis.model.X_Biodata;
import com.xsis.model.X_Keahlian;
import com.xsis.model.X_Skill_Level;
import com.xsis.repository.X_BiodataRepo;
import com.xsis.repository.X_KeahlianRepo;
import com.xsis.service.X_KeahlianService;
import com.xsis.service.X_Skill_LevelService;

@Controller
public class KeahlianController {

	@Autowired
	private X_BiodataRepo biorepo;
	
	@Autowired
	private X_KeahlianService keahlianscr;
	
	@Autowired
	private X_KeahlianRepo keahlianrepo;
	
	@Autowired
	private X_Skill_LevelService skillleverscr;
	
	
	@GetMapping(value = "/keahlian/{bid}")
	public ModelAndView index(@PathVariable("bid") Long biodataId) {
		ModelAndView view = new ModelAndView("keahlian/keahlian");
		
		// get biodata Id
		X_Biodata biodata = this.biorepo.findById(biodataId).orElse(null);
		view.addObject("biodata", biodata);
		
		List<X_Keahlian> listkeahlian = this.keahlianrepo.findByBiodataId(biodataId);
		view.addObject("listkeahlian",listkeahlian);
		
		return view;
	}
	
	@GetMapping(value = "/keahlian/list/{bid}")
	private ModelAndView list(@PathVariable("bid") Long biodataId) {
		// view list keahlian
		ModelAndView view = new ModelAndView("keahlian/listkeahlian");
		// get biodata Id
		X_Biodata biodata = this.biorepo.findById(biodataId).orElse(null);
		view.addObject("biodata", biodata);

		// get keahlian
		List<X_Keahlian> listkeahlian = this.keahlianrepo.findByBiodataId(biodataId);
		view.addObject("listkeahlian", listkeahlian);
		return view;
	}
	
	
	@GetMapping(value = "/keahlian/add/{bid}") // bid sebagai vaiable biodataId
	public ModelAndView create(@PathVariable("bid") Long biodataId) {
		// menampilkan view dari folder keahlian file newkeahlian.html
		ModelAndView view = new ModelAndView("keahlian/newkeahlian");
		// membuat object keahlian model
		X_Keahlian keahlian = new X_Keahlian();
		// set biodata id
		keahlian.setBiodataId(biodataId);

		List<X_Skill_Level> listSkill = this.skillleverscr.listall();
		// add object keahlian
		view.addObject("keahlian", keahlian);
		// add object list skill
		view.addObject("listSkill", listSkill);
		return view;
	}
	
	
	@PostMapping(value = "/keahlian/save")
	public ModelAndView saveadd(@Valid @ModelAttribute("keahlian") X_Keahlian keahlian, BindingResult result) {
		// menampilkan view dari folder keahlian file newkeahlian.html
		ModelAndView view = new ModelAndView("keahlian/newkeahlian");
		
		List<X_Skill_Level> listSkill = this.skillleverscr.listall();
		// add object list skill
		view.addObject("listSkill", listSkill);
		
		System.out.println(keahlian);
		view.addObject("keahlian", keahlian);
		keahlianscr.simpanbaru(keahlian);
		return view;
	}
	
	
	@GetMapping(value = "/keahlian/ubah/{sid}") 
	public ModelAndView edit(@PathVariable("sid") Long sid) {
		// menampilkan view dari folder keahlian file editkeahlian.html
		ModelAndView view = new ModelAndView("keahlian/editkeahlian");
		// membuat object keahlian model
		X_Keahlian keahlian = this.keahlianrepo.findById(sid).orElse(null);

		List<X_Skill_Level> listSkill = this.skillleverscr.listall();
		// add object keahlian
		view.addObject("keahlian", keahlian);
		// add object list skill
		view.addObject("listSkill", listSkill);
		return view;
	}
	
	@PutMapping(value = "/keahlian/saveubahkeahlian")
	public ModelAndView save(@Valid @ModelAttribute("keahlian") X_Keahlian keahlian, BindingResult result) {
		// menampilkan view dari folder keahlian file editkeahlian.html
		ModelAndView view = new ModelAndView("keahlian/editkeahlian");
		
		List<X_Skill_Level> listSkill = this.skillleverscr.listall();
		// add object list skill
		view.addObject("listSkill", listSkill);
		
			view.addObject("keahlian", keahlian);
	
			// simpan ke service
			keahlianscr.simpanubah(keahlian);
		return view;
	}
	
	
	
	/* bagian hapus keahlian */
	@GetMapping(value = "/keahlian/hapus/{sid}")
	private ModelAndView hapus(@PathVariable("sid") Long sid) {
		// view hapuskeahlian
		ModelAndView view = new ModelAndView("keahlian/hapuskeahlian");
		// get keahlian
		X_Keahlian keahlian = this.keahlianrepo.findById(sid).orElse(null);
		view.addObject("keahlian", keahlian);
		return view;
	}
	
	
	@PostMapping(value = "/keahlian/remove")
	private ModelAndView remove(@ModelAttribute("keahlian") X_Keahlian keahlian) {
		// get keahlian
		X_Keahlian item = this.keahlianrepo.findById(keahlian.getId()).orElse(null);

		keahlianscr.hapus(item);


		// view keahlian
		ModelAndView view = new ModelAndView("keahlian/hapuskeahlian");
		view.addObject("keahlian", item);
		return view;
	}
	
}
