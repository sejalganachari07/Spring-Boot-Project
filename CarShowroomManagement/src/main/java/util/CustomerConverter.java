package util;

import org.springframework.beans.BeanUtils;

import com.CarShowroomManagement.entity.Customer;
import com.CarShowroomManagement.model.CustomerDTO;

import jakarta.persistence.Converter;

public class CustomerConverter {
	public CustomerDTO convertEntityToCustomerDTO (Customer customer)
	{
		 CustomerDTO customerDTO = new CustomerDTO();
		 if(customer != null)
		 {
			 BeanUtils.copyProperties(customer, customerDTO);
			 
		 }
		 return customerDTO;
	}
	//converts from CustomerDTO to Customer entity
	public Customer convertDTOToCoustomer(CustomerDTO customerDTO)
	{
		Converter customer = (Converter) new CustomerConverter();
		if(customerDTO!=null)
		{
			BeanUtils.copyProperties(customerDTO, customer);
			
		}
		return (Customer) customer;
	}

}
