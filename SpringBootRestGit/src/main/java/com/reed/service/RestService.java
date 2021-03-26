package com.reed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reed.dao.entities.Employee;
import com.reed.dao.repo.EmpRepo;

@Service
public class RestService {
@Autowired
EmpRepo empRepo;
	public Employee saveEmployee(Employee employee)
	{
		return empRepo.save(employee);
	}
	
}
