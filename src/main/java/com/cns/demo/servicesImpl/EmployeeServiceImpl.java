package com.cns.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cns.demo.entites.Employee;
import com.cns.demo.repository.EmployeeRepository;
import com.cns.demo.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository emRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return emRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee>empList = emRepo.findAll();
		
		return empList;
	}

	@Override
	public Employee getSingleEmployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
