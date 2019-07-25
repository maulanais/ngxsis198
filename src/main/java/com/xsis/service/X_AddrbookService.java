package com.xsis.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.X_Addrbook;
import com.xsis.repository.X_AddrbookRepo;

@Service
@Transactional
public class X_AddrbookService {

	@Autowired
	private X_AddrbookRepo addrrepo;
	
	
	public boolean simpanubahpwd(X_Addrbook addrbook) {
		try {
			 System.out.println(addrbook);
			 X_Addrbook addrbook2 = this.addrrepo.findById(addrbook.getId()).orElse(null);
			 addrbook2.setAbpwd(addrbook.getAbpwd());
			 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			 addrbook2.setModifiedBy(addrbook.getId());
			 addrbook2.setModifiedOn(timestamp);
			 addrrepo.save(addrbook2); 
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
}
