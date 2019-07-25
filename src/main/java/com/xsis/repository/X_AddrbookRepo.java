package com.xsis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xsis.model.X_Addrbook;

public interface X_AddrbookRepo  extends JpaRepository<X_Addrbook, Long> {

	
	
	  @Query("SELECT x FROM X_Addrbook x WHERE x.fpToken=:fpToken") public
	  X_Addrbook findByFpToken(@Param ("fpToken") String fpToken);
	 
	 
	
}
