package com.junit.testing.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.testing.learning.model.Employee;
import com.junit.testing.learning.repository.EmployeeRepository;

@Service 
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepo; 
	
	public Employee addEmployee(Employee emp ) {
		
		return emprepo.save(emp);
	}
	
	public List<Employee> getAllEmployee(){
		return emprepo.findAll(); 
	}
	
	
}
