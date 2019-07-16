package com.xsis.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.model.BiodataModel;
import com.xsis.service.BiodataService;

@Controller
public class BiodataController {
	/*
	 * @Autowired private BiodataService biodatasr;
	 */
	@RequestMapping("/biodata")
	public String biodata() {
		return "biodata/biodata";
	}
	
	/*
	 * @RequestMapping("/listbiodata") public String listbiodata(Model mdl) {
	 * 
	 * List<BiodataModel> biodatas = biodatasr.listall();
	 * mdl.addAttribute("keybiodata", biodatas); return ("biodata/listbiodata"); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/editbiodata", method = RequestMethod.PUT) public
	 * Map<String, String> editbiodata(@ModelAttribute("biodatas") BiodataModel
	 * biodatas, Model model) {
	 * 
	 * System.out.println(biodatas); Timestamp timestamp = new
	 * Timestamp(System.currentTimeMillis()); biodatas.setCreated_on(timestamp);
	 * biodatas.setIs_deleted(false); biodatas.setCreated_on(timestamp);
	 * biodatas.setModified_by((long) 1); biodatas.setModified_on(timestamp);
	 * biodatas.setDeleted_by((long) 1); biodatas.setDeleted_on(timestamp); //
	 * brngsr.save(barangs); System.out.println("Bissmillah"); Map<String, String>
	 * map = new HashMap<>();
	 * 
	 * if (biodatasr.update(biodatas)) { map.put("status", "berhasil"); } else {
	 * map.put("status", "gagal"); } return map; }
	 */
	
}