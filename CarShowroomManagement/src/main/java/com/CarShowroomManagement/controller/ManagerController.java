package com.CarShowroomManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.CarShowroomManagement.model.ManagerDTO;
import com.CarShowroomManagement.service.ManagerService;

import jakarta.validation.Valid;
import util.ManagerConverter;

public class ManagerController {
	@Autowired
	private ManagerService managerService;
	
	@Autowired
	private ManagerConverter managerconverter;
	
	@PostMapping("/createShowroomManager")
	public String createShowroomManager (@Valid @RequestBody ManagerDTO managerDTO)
	{
		final ManagerConverter sm= managerconverter.convertDTOToShowroomManager(managerDTO);
		return managerService.createManager(sm) ;
		
	}
	@GetMapping("/getCustomerById/{manager_id}")
	public ManagerDTO getById(@PathVariable("manager_id") int manager_id)
	{
		return managerService.getManagerById(manager_id);
		
	
}
	@GetMapping("/getAllManager")
	public List<ManagerDTO> getAllManager(){
		return managerService.getAllManager();
		
	}
	
	@PutMapping("/updateManager/{id}")
	public ManagerDTO updateManager (@PathVariable("manager_id") int manager_id, 
			@RequestBody ManagerDTO managerDTO)
	{
		
		ManagerConverter sm1 = managerconverter.convertDTOToShowroomManager(managerDTO);
		return managerService.updateManager(manager_id, sm1);
		
	}
	@GetMapping("/getmanagerByName/{managername}")
	public List<ManagerDTO> getmanagerByName(@PathVariable("managername") String managername)
	{
		return managerService.getmanagerByshowroommanagername(managername);
		
	}

}
