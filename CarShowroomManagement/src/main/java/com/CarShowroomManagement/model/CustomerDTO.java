package com.CarShowroomManagement.model;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;


public class CustomerDTO {
	private int customer_id;
	@NotNull(message="Customer Name should not be null")
	
	private String customerName;
	
	@NotNull(message="Customer contactno should not be null")
	private String contactNo;
	
	
	private String address;
	
	@NotNull
	@Email(message="Customer emailId should not be null")
	private String emailId;
	
	

	public Object getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}

}
