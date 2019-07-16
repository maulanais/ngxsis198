package com.xsis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.model.PendidikanModel;
import com.xsis.repository.PendidikanRepo;

@Service
@Transactional
public class PendidikanService {

	@Autowired
	private PendidikanRepo pendidikanRepo;

	public List<PendidikanModel> listall() {
		return pendidikanRepo.findAll();
	}

	public boolean simpan(PendidikanModel pendidikans) {
		// brng.save(brng);
		try {
			pendidikanRepo.save(pendidikans);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean hapus(Long id) {
		try {
			pendidikanRepo.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean update(PendidikanModel barangs) {
		// brng.save(brng);
		try {
			pendidikanRepo.save(barangs);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
