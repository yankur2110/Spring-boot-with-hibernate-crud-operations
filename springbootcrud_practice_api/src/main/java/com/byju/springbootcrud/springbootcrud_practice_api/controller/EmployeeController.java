package com.byju.springbootcrud.springbootcrud_practice_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byju.springbootcrud.springbootcrud_practice_api.model.Employee;
import com.byju.springbootcrud.springbootcrud_practice_api.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> get(){
		return employeeService.get();
	}
	
	@PostMapping("/saveEmployee")
	public void save(@RequestBody Employee employee){
		employeeService.save(employee);
		System.out.println("successfully inserted the employee object");
	}
	
	@GetMapping("/getEmployeeWithId/{id}")
	public Employee get(@PathVariable("id") int id){
		Employee employee = employeeService.get(id);
		return employee;
	}

	@DeleteMapping("/deleteEmployeeWithId/{id}")
	public void delete(@PathVariable("id") int id){
		employeeService.delete(id);
		System.out.println("successfully delete the employee with given id");
	}
	
	@PutMapping("/updateEmployee")
	public void update(@RequestBody Employee employee){
		employeeService.save(employee);
		System.out.println("operation successful. If id was not present new entry added otherwise update the same column");
	}
}
