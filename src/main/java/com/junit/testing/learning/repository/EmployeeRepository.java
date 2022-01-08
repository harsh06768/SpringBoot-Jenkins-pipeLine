package com.junit.testing.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junit.testing.learning.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
