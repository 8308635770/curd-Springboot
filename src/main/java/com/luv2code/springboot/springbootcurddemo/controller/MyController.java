package com.luv2code.springboot.springbootcurddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.luv2code.springboot.springbootcurddemo.entity.Employee;
import com.luv2code.springboot.springbootcurddemo.service.RestDao;
import com.luv2code.springboot.springbootcurddemo.serviceLayer.EmployeeService;

@Component
@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home(){
		
		return "home";
	}
	
	@GetMapping("/employess")
	public List<Employee> getEmployees(){
		
		List<Employee>employees=employeeService.getEmployees();
		return employees;
	}
	
	@GetMapping("/employess/{id}")
	public Employee getEmployeeByid(@PathVariable int id) {
		return employeeService.findEmployeByid(id);
	}
	
	@PostMapping("/employess")
	public void saveEmployee() {
		employeeService.saveEmployee(new Employee(6,"Yash","Tapdiya","yash@123"));
	}
	
	@DeleteMapping("/employess/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployeeByid(id);
	}

}
