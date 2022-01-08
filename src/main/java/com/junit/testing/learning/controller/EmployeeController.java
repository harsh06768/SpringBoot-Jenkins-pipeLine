package com.junit.testing.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.testing.learning.model.Employee;
import com.junit.testing.learning.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired 
	private EmployeeService empservice ; 
	
	
	
	@PostMapping("/addemployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		
		return new ResponseEntity<Employee>(empservice.addEmployee(emp), HttpStatus.CREATED); 
	}
	
	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployee(){
		
		return empservice.getAllEmployee(); 
	}
	
	
	
	
}
