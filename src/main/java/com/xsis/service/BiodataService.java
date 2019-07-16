package com.xsis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.model.BiodataModel;
import com.xsis.repository.BiodataRepo;

@Service
@Transactional
public class BiodataService {
	
	@Autowired
	private BiodataRepo biodataRepo;

	public List<BiodataModel> listall() {
		return biodataRepo.findAll();
	}

	public boolean simpan(BiodataModel biodatas) {
		// brng.save(brng);
		try {
			biodataRepo.save(biodatas);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	public boolean update(BiodataModel barangs) {
		// brng.save(brng);
		try {
			biodataRepo.save(barangs);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
