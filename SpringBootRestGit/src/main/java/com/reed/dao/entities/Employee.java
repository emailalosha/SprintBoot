package com.reed.dao.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	
	private String empName;
	private String empRegNo;
	private int age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRegNo() {
		return empRegNo;
	}
	public void setEmpRegNo(String empRegNo) {
		this.empRegNo = empRegNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
