package com.CarShowroomManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.CarShowroomManagement.entity.Manager;

import util.ManagerConverter;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{

		Object save = null;

		@Query("from Manager b where b.managerName like %:a%")
		List<Manager> findBymanagerName (@Param("a")  String managerName);

		static void save(ManagerConverter sm) {
			// TODO Auto-generated method stub

}
}
