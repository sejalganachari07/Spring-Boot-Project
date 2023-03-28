package com.CarShowroomManagement.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="customers")
@Getter
@Setter
@ToString

public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(length= 50, name="customer")
private String customerName;
@Column(length=20)
private long contact;
@Column(length=20)
private String address;
@Column(length=50)
private int age;
@Column(length=50)
private int purchasescar;




	
}

