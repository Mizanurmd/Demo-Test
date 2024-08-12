package com.cns.demo.services;

import java.util.List;



import com.cns.demo.entites.Employee;


public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee>getAllEmployee();
	Employee getSingleEmployee(Long id);
	Employee deleteEmployee(Long id);

}
