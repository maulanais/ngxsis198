package com.xsis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.model.KeluargaModel;
import com.xsis.repository.KeluargaRepo;

@Service
@Transactional
public class KeluargaService {

	@Autowired
	private KeluargaRepo rl;

	public List<KeluargaModel> listall() {
		return rl.findAll();
	}

	public boolean simpan(KeluargaModel keluargas) {
		// brng.save(brng);
		try {
			rl.save(keluargas);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean hapus(Long id) {
		try {
			rl.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean update(KeluargaModel barangs) {
		// brng.save(brng);
		try {
			rl.save(barangs);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
