package com.reed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reed.dao.entities.Employee;
import com.reed.service.RestService;

@RestController
public class MyRestController {

	@Autowired
	RestService restService;
	
	@RequestMapping(value = "/employees",method = RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return restService.saveEmployee(employee);
	}
	
}
