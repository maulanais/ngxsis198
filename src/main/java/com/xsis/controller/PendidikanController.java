package com.xsis.controller;

import java.sql.Timestamp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.model.EducationLevelModel;
import com.xsis.model.PendidikanModel;
import com.xsis.service.EducationLevelService;
import com.xsis.service.PendidikanService;


@Controller
public class PendidikanController {
	@Autowired
	private PendidikanService pendidikansr;

	private EducationLevelService levelsr;

	@RequestMapping("/pendidikan")
	public String pendidikan() {
		return "pendidikan/pendidikan";
	}

	@RequestMapping(value = "/newpendidikan", method = RequestMethod.GET)
	public String newpendidik(Model model) {
		PendidikanModel pendidikan = new PendidikanModel();

		model.addAttribute("kbarang", pendidikan);

		return ("pendidikan/newpendidikan");
	}

	@RequestMapping("/ubahpendidikan")
	public String ubahPendidikan() {
		return "pendidikan/ubahpendidikan";
	}

	@RequestMapping("/hapuspendidikan")
	public String hapusPendidikan() {
		return "pendidikan/hapuspendidikan";
	}

	@RequestMapping("/listpendidikan")
	public String listpendidikan(Model mdl) {

		List<PendidikanModel> pendidikans = pendidikansr.listall();
		mdl.addAttribute("keypendidikan", pendidikans);
		return ("pendidikan/listpendidikan");
	}
	

	@ResponseBody
	@RequestMapping("/listeducation")
	public Map<String, String> listeducation(Model mdl) {

		Map<String, String> map = new HashMap<>();
		

		//List<EducationLevelModel> edu = levelsr.listall();
		if(levelsr.listall()) {
			map.put("status", "berhasil");	
		}else {
			map.put("status", "gagal");
		}
		//mdl.addAttribute("keyedu", edu);
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/savependidikan", method = RequestMethod.POST)
	public Map<String, String> savependidikan(@ModelAttribute("pendidikans") PendidikanModel pendidikans, Model model) {

		System.out.println("simpan pendidikan");
		System.out.println(pendidikans.getEntry_year());
		System.out.println(pendidikans);

		// HardCode untuk yang tidak ada di Pop UP
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		pendidikans.setCreated_on(timestamp);
		pendidikans.setIs_delete(false);
		pendidikans.setBiodata_id((long) 1);
		pendidikans.setCreated_on(timestamp);
		pendidikans.setModified_by((long) 1);
		pendidikans.setModified_on(timestamp);
		pendidikans.setDeleted_by((long) 1);
		pendidikans.setDeleted_on(timestamp);
		pendidikans.setJudul_ta("ada");
		pendidikans.setDeskripsi_ta("Deskripsi");
		// brngsr.save(barangs);

		Map<String, String> map = new HashMap<>();

		if (pendidikansr.simpan(pendidikans)) {
			map.put("status", "berhasil");
		} else {
			map.put("status", "gagal");
		}
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/deletependidikan/{angka}", method = RequestMethod.DELETE)
	public Map<String, String> deletependidikan(@PathVariable("angka") Long angka, Model model) {
		System.out.println(angka);
		pendidikansr.hapus(angka);
		Map<String, String> map = new HashMap<>(); // map untuk menentukan key value dari map put
		map.put("status", "berhasil");
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/editpendidikan", method = RequestMethod.PUT)
	public Map<String, String> editpendidikan(@ModelAttribute("pendidikans") PendidikanModel pendidikans, Model model) {

		System.out.println(pendidikans);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		pendidikans.setCreated_on(timestamp);
		pendidikans.setIs_delete(false);
		pendidikans.setBiodata_id((long) 1);
		pendidikans.setCreated_on(timestamp);
		pendidikans.setModified_by((long) 1);
		pendidikans.setModified_on(timestamp);
		pendidikans.setDeleted_by((long) 1);
		pendidikans.setDeleted_on(timestamp);
		pendidikans.setJudul_ta("ada");
		pendidikans.setDeskripsi_ta("Deskripsi");
		// brngsr.save(barangs);
		System.out.println("Bissmillah");
		Map<String, String> map = new HashMap<>();

		if (pendidikansr.update(pendidikans)) {
			map.put("status", "berhasil");
		} else {
			map.put("status", "gagal");
		}
		return map;
	}
}
