package com.xsis.service;

import java.sql.Timestamp;

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
	
    @Autowired
    private JavaMailSender javaMailSender;
	
	
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
	
    public boolean sendChangePasswordEmail(X_Addrbook addrbook) {
    	try {
    		
    		X_Addrbook addrbook2 = this.addrrepo.findById(addrbook.getId()).orElse(null);
    		 SimpleMailMessage msg = new SimpleMailMessage();
    	        msg.setFrom("adnan@localhost");
    	        msg.setTo(addrbook2.getEmail());
    	        msg.setSubject("Testing from Spring Boot");
    	        msg.setText("Hello World \n Spring Boot Email \n Link Forgot Password \n http://localhost:8585/forgotpassword/"+addrbook2.getFpToken());

    	        javaMailSender.send(msg);
    		return true;
    	}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
       
    }
	
}
