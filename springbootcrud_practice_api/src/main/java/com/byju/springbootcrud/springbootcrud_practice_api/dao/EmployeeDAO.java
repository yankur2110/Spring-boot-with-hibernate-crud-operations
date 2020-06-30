package com.byju.springbootcrud.springbootcrud_practice_api.dao;

import java.util.List;

import com.byju.springbootcrud.springbootcrud_practice_api.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
