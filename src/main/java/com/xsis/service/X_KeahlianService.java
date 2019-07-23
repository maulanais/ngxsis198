package com.xsis.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.X_Keahlian;
import com.xsis.repository.X_KeahlianRepo;

@Service
@Transactional
public class X_KeahlianService {

	@Autowired
	private X_KeahlianRepo keahlianrepo;
	
	public List<X_Keahlian> listall(){
		return keahlianrepo.findAll();
	}
	
	public List<X_Keahlian> listallactive(){
		return keahlianrepo.findAllActive();
	}
	
	public List<X_Keahlian> listallnonactive(){
		return keahlianrepo.findAllNonActive();
	}
	
	
	public boolean simpanbaru(X_Keahlian keahlian) {
		try {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			keahlian.setCreatedBy(Long.parseLong("2"));
			 keahlian.setCreatedOn(timestamp); 
			 keahlian.setIsDelete(false);
			 System.out.println(keahlian);
			keahlianrepo.save(keahlian);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	public boolean simpanubah(X_Keahlian keahlian) {
		try {
			
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			keahlian.setModifiedBy(Long.parseLong("2"));
			keahlian.setModifiedOn(timestamp);
			System.out.println(keahlian);
			keahlianrepo.save(keahlian);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	public boolean hapus(X_Keahlian keahlian) {
		try {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			keahlian.setIsDelete(true);
			keahlian.setDeletedBy(Long.parseLong("2"));
			keahlian.setDeletedOn(timestamp); 
			System.out.println(keahlian);
			keahlianrepo.save(keahlian);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
