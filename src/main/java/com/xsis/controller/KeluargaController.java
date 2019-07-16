package com.xsis.controller;

import java.sql.Timestamp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.model.KeluargaModel;
import com.xsis.service.KeluargaService;

@Controller
public class KeluargaController {
	/*
	 * @Autowired private KeluargaService keluargasr;
	 */
	@RequestMapping("/keluarga")
	public String keluarga() {
		return "keluarga/keluarga";
	}

	/*
	 * @RequestMapping(value = "/newkeluarga", method = RequestMethod.GET) public
	 * String newpendidik(Model model) { KeluargaModel keluarga = new
	 * KeluargaModel();
	 * 
	 * model.addAttribute("kbarang", keluarga);
	 * 
	 * return ("keluarga/newkeluarga"); }
	 * 
	 * @RequestMapping("/ubahkeluarga") public String ubahKeluarga() { return
	 * "keluarga/ubahkeluarga"; }
	 * 
	 * @RequestMapping("/hapuskeluarga") public String hapusKeluarga() { return
	 * "keluarga/hapuskeluarga"; }
	 * 
	 * @RequestMapping("/listkeluarga") public String listkeluarga(Model mdl) {
	 * 
	 * List<KeluargaModel> keluargas = keluargasr.listall();
	 * mdl.addAttribute("keykeluarga", keluargas); return ("keluarga/listkeluarga");
	 * }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/savekeluarga", method = RequestMethod.POST) public
	 * Map<String, String> savekeluarga(@ModelAttribute("keluargas") KeluargaModel
	 * keluargas, Model model) {
	 * 
	 * System.out.println("simpan keluarga"); System.out.println(keluargas);
	 * 
	 * // HardCode untuk yang tidak ada di Pop UP Timestamp timestamp = new
	 * Timestamp(System.currentTimeMillis()); keluargas.setCreated_on(timestamp);
	 * keluargas.setIs_delete(false); keluargas.setBiodata_id((long) 1);
	 * keluargas.setCreated_on(timestamp); keluargas.setModified_by((long) 1);
	 * keluargas.setModified_on(timestamp); keluargas.setDeleted_by((long) 1);
	 * keluargas.setDeleted_on(timestamp); // brngsr.save(barangs);
	 * 
	 * Map<String, String> map = new HashMap<>();
	 * 
	 * if (keluargasr.simpan(keluargas)) { map.put("status", "berhasil"); } else {
	 * map.put("status", "gagal"); } return map; }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/deletekeluarga/{angka}", method =
	 * RequestMethod.DELETE) public Map<String, String>
	 * deletekeluarga(@PathVariable("angka") Long angka, Model model) {
	 * System.out.println(angka); keluargasr.hapus(angka); Map<String, String> map =
	 * new HashMap<>(); // map untuk menentukan key value dari map put
	 * map.put("status", "berhasil"); return map; }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/editkeluarga", method = RequestMethod.PUT) public
	 * Map<String, String> editkeluarga(@ModelAttribute("keluargas") KeluargaModel
	 * keluargas, Model model) {
	 * 
	 * System.out.println("Keluarga"); Timestamp timestamp = new
	 * Timestamp(System.currentTimeMillis()); keluargas.setCreated_on(timestamp);
	 * keluargas.setIs_delete(false); keluargas.setBiodata_id((long) 1);
	 * keluargas.setCreated_on(timestamp); keluargas.setModified_by((long) 1);
	 * keluargas.setModified_on(timestamp); keluargas.setDeleted_by((long) 1);
	 * keluargas.setDeleted_on(timestamp); // brngsr.save(barangs);
	 * System.out.println("Bissmillah"); Map<String, String> map = new HashMap<>();
	 * 
	 * if (keluargasr.update(keluargas)) { map.put("status", "berhasil"); } else {
	 * map.put("status", "gagal"); } return map; }
	 */
}
