package com.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.SertifikasiModel;
import com.xsis.repository.SertifikasiRepo;





@Service
@Transactional
public class SertifikasiService {

	@Autowired
	private SertifikasiRepo sertifikasi;
	
	public List<SertifikasiModel> listall(){
		return sertifikasi.findAll();
	}
}
