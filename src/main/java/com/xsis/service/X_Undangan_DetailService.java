package com.xsis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xsis.model.X_Undangan_Detail;
import com.xsis.repository.X_Undangan_DetailRepo;

@Service
@Transactional
public class X_Undangan_DetailService {

	@Autowired
	private X_Undangan_DetailRepo undangandetailrepo;
	
	public List<X_Undangan_Detail> listall(){
		return undangandetailrepo.findAll();
	}
}
