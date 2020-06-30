package com.byju.springbootcrud.springbootcrud_practice_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.byju.springbootcrud.springbootcrud_practice_api.dao.EmployeeDAOImpl;
import com.byju.springbootcrud.springbootcrud_practice_api.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAOImpl employeeDAO;

	@Override
	@Transactional
	public List<Employee> get() {
		return employeeDAO.get();
	}

	@Override
	@Transactional
	public Employee get(int id) {
		Employee employee = employeeDAO.get(id);
		return employee;
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	@Override
	@Transactional
	public void delete(int id) {

		employeeDAO.delete(id);
	}
	
}
