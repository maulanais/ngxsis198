package com.xsis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.model.X_Undangan;
import com.xsis.repository.X_UndanganRepo;

@Service
@Transactional
public class X_UndanganService {

	@Autowired
	private X_UndanganRepo undanganrepo;
	
	public List<X_Undangan> listall(){
		return undanganrepo.findAll();
	}
}
