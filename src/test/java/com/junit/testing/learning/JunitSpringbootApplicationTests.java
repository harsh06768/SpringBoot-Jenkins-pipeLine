package com.junit.testing.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when; 
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.junit.testing.learning.model.Employee;
import com.junit.testing.learning.repository.EmployeeRepository;
import com.junit.testing.learning.service.EmployeeService;



@SpringBootTest

class JunitSpringbootApplicationTests {

	@Autowired 
	private EmployeeService empserv; 
	
	@MockBean 
	private EmployeeRepository emprepo; 
	
	@Test
	public void getAllEmployeeTest() {
		when(emprepo.findAll()).thenReturn(Stream
				.of(new Employee(103, "Keshav Soni", 25000), new Employee(104, "Mohit Yadav", 30000)).collect(Collectors.toList()));
	 assertEquals(2, empserv.getAllEmployee().size()); 
	
	}
	
	@Test
	public void addEmployeeTest() {
		Employee e1=new Employee(108, "Naresh Kundal", 40000); 
		when(emprepo.save(e1)).thenReturn(e1); 
		assertEquals(e1,  empserv.addEmployee(e1));
	}

}
