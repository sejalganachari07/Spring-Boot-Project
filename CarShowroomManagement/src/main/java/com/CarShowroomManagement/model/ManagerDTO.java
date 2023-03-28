package com.CarShowroomManagement.model;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public class ManagerDTO {
private int manager_Id;
	
	
	@NotNull
	private String  CarshowroommanagerName;
	private List<CustomerDTO> customer;
	
	

}
