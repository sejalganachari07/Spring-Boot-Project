package com.CarShowroomManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.CarShowroomManagement.model.BillDTO;

public interface BillRepository extends JpaRepository<BillDTO, Integer> {
		List<BillDTO> getBills();

	    List<BillDTO> getBillByUsername(@Param("username") String username);
	}


