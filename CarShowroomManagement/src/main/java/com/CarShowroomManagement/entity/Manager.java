package com.CarShowroomManagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int manager_id;
	
	@Column(length = 50, nullable=false)
	private String managerName;
	
	
	@OneToMany(cascade =CascadeType.ALL)
	private List<Customer> customer;
	
	@Builder
	public Manager(int manager_id,String managerName) {
		super();
		this.manager_id=manager_id;
		this.managerName=managerName;
	}

	public Object getmanagerName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setmanagerName(Object managerName2) {
		// TODO Auto-generated method stub
		
	}

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}


}
