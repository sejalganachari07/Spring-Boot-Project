package com.CarShowroomManagement.service;

import java.util.List;

import com.CarShowroomManagement.entity.Manager;
import com.CarShowroomManagement.model.ManagerDTO;

import util.ManagerConverter;

public interface ManagerService {
		String createShowroomManager(ManagerConverter sm);

		List<ManagerDTO> getAllManager();
		ManagerDTO updateManager (int manager_id, ManagerConverter sm1);
		List<ManagerDTO> getmanagerByshowroommanagername(String showroomManagername);
		
		String createManager(ManagerConverter sm);
		ManagerDTO getManagerById(int Manager_id);
		ManagerDTO updateManager(int manager_id, Manager sm);

		List<ManagerDTO> getmanagerBymanagername(String managername);

		String createManager(Manager sm);

		


}
