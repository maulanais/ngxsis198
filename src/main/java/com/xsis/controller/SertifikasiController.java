package com.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xsis.model.SertifikasiModel;
import com.xsis.service.SertifikasiService;


@Controller
public class SertifikasiController {
	
	
	@Autowired
	private SertifikasiService sertifikasisr;
	
	
	@RequestMapping("/sertifikasi")
	public String sertifikasi() {
		return ("sertifikasi/sertifikasi");
	}
	
	@RequestMapping("/listsertifikasi")
	public String listbarang(Model mdl) {
		
		List<SertifikasiModel> sertifikasis = sertifikasisr.listall();
		
		mdl.addAttribute("keysertifikasi",sertifikasis);
		
		return ("sertifikasi/listsertifikasi");
	}
	
	@RequestMapping("/newsertifikasi")
	public String newsertifikasi() {
		return ("sertifikasi/newsertifikasi");
	}
	
	@RequestMapping("/hapussertifikasi")
	public String hapussertifikasi() {
		return ("sertifikasi/hapussertifikasi");
	}
	
	@RequestMapping("/ubahsertifikasi")
	public String ubahsertifikasi() {
		return ("sertifikasi/ubahsertifikasi");
	}
	

	
	
}
