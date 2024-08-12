package com.cns.demo.entites;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String designation;
	private Date joinDate;
	private double salary;
	private String description;
	
	

}
