package com.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.xsis.model.EducationLevelModel;
import com.xsis.repository.EducationLevelRepo;

public class EducationLevelService {
	@Autowired
	private EducationLevelRepo educationLevelRepo;

	/*
	 * public EducationLevelModel cariid(Long id) { return level.findById(id).get();
	 * }
	 */
	
	public Boolean cariid(Long id) {
		return true;
	}
	public Boolean listall() {
		return true;
		/*
		 * try { level.findAll(); System.out.println("berhasil"); return true; } catch
		 * (Exception e) { System.out.println("error"); return false; }
		 */
		
	}
}

