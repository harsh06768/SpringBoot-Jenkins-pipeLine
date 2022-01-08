package com.junit.testing.learning.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "tbl_employee")


public class Employee {

	@Id
	private long empid; 
	private String empname ; 
	private long salary ;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(long empid, String empname, long salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}


	public long getEmpid() {
		return empid;
	}


	public void setEmpid(long empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	} 
	
	
}
