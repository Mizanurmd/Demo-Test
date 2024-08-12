package com.cns.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cns.demo.entites.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
