package com.xsis.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.X_Keahlian;
import com.xsis.model.X_Skill_Level;
import com.xsis.repository.X_KeahlianRepo;
import com.xsis.repository.X_Skill_LevelRepo;

@Service
@Transactional
public class X_KeahlianService {

	@Autowired
	private X_KeahlianRepo keahlianrepo;
	
	@Autowired
	private X_Skill_LevelRepo skillrepo;
	
    @Autowired
    private JavaMailSender javaMailSender;
	
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
	
    public boolean sendAddKeahlianEmail(X_Keahlian keahlian) {
    	try {
    		
    		X_Skill_Level skilllevel=this.skillrepo.findById(keahlian.getSkillLevelId()).orElse(null);
    		
    		 SimpleMailMessage msg = new SimpleMailMessage();
    	        msg.setFrom("adnan@localhost");
    	        msg.setTo("ganjar@localhost");
    	        msg.setSubject("Testing from Spring Boot");
    	        msg.setText("Hello World \n Spring Boot Email \n Add Keahlian \n" + keahlian.getSkillName()+"\n"+skilllevel.getName()+"\n");


    	        javaMailSender.send(msg);
    		return true;
    	}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
       
    }
	
}
