package com.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.X_Keahlian;
import com.xsis.model.X_Skill_Level;
import com.xsis.repository.X_Skill_LevelRepo;

@Service
@Transactional
public class X_Skill_LevelService {

	@Autowired
	private X_Skill_LevelRepo skilllevelrepo;
	
	public List<X_Skill_Level> listall(){
		return skilllevelrepo.findAll();
	}
}
