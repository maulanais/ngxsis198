package com.xsis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.model.X_Schedule_Type;
import com.xsis.repository.X_Schedule_TypeRepo;

@Service
@Transactional
public class X_Schedule_TypeService {

	@Autowired
	private X_Schedule_TypeRepo scheduletyperepo;
	
	public List<X_Schedule_Type> listall(){
		return scheduletyperepo.findAll();
	}
}
