package com.xsis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsis.model.SertifikasiModel;
public interface SertifikasiRepo extends JpaRepository<SertifikasiModel, Long> {
	
}
