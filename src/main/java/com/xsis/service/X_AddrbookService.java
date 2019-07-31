package com.xsis.service;

import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.X_Addrbook;
import com.xsis.model.X_Keahlian;
import com.xsis.model.X_Skill_Level;
import com.xsis.repository.X_AddrbookRepo;

@Service
@Transactional
public class X_AddrbookService {

	@Autowired
	private X_AddrbookRepo addrrepo;
	
	
	
	public boolean simpanubahpwd(X_Addrbook addrbook,HttpSession httpSession) {
		try {
			 System.out.println(addrbook);
			 X_Addrbook addrbook2 = this.addrrepo.findById(addrbook.getId()).orElse(null);
			 addrbook2.setAbpwd(addrbook.getAbpwd());
			 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			 addrbook2.setModifiedBy(Long.parseLong(httpSession.getAttribute("abuid").toString()));
			 addrbook2.setModifiedOn(timestamp);
			 addrrepo.save(addrbook2); 
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	

	
}
