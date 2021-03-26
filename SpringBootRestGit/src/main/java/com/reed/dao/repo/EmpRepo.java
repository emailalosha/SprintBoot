package com.reed.dao.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reed.dao.entities.Employee;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Long>{

}
