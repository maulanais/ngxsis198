package com.xsis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xsis.model.X_Keahlian;

public interface X_KeahlianRepo extends JpaRepository<X_Keahlian, Long> {
	
	
	@Query("SELECT x FROM X_Keahlian  x WHERE x.isDelete=false AND x.biodataId= :biodataId ORDER BY x.modifiedOn desc, x.createdOn desc")
	 public List<X_Keahlian> findByBiodataId(@Param("biodataId") Long biodataId); 
	 
	// yang aktif
	@Query(value="SELECT x FROM X_Keahlian  x WHERE x.isDelete=false ORDER BY x.createdOn desc, x.modifiedOn desc")
	public List<X_Keahlian> findAllActive();
	
	// untuk mencari yang tidak aktif, atau sudah terhapus
	@Query(value="SELECT x FROM X_Keahlian x WHERE x.isDelete=true")
	public List<X_Keahlian> findAllNonActive();
	
}
