package com.cns.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cns.demo.entites.Employee;
import com.cns.demo.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired(required = true)
	private EmployeeService emServ;

	// save record in DB
	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee em = emServ.saveEmployee(employee);

		return new ResponseEntity<Employee>(em, HttpStatus.CREATED.OK);
	
	}
	
	//  Retrieve data from DB
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>>getAllEmRecords(){
		List<Employee>list = emServ.getAllEmployee();
		
		return new ResponseEntity<List<Employee>>(list,HttpStatus.ACCEPTED.OK);
	}
	
	

}
