package com.CarShowroomManagement.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class BillDTO {
	@NotNull(message="Bill Name should not be null")
	private String Name;
	
	@NotNull
	@Email(message="Customer emailId should not be null")
	private String emailId;
	

	@NotNull(message="Customer contactno should not be null")
	private String contactNo;
	
	@NotNull(message="Customer paymentmethod should not be null")
	private String paymentMethod;
	

}
