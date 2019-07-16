package com.xsis.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.xsis.model.BiodataModel;


public interface BiodataRepo extends JpaRepository<BiodataModel, Long>{

}