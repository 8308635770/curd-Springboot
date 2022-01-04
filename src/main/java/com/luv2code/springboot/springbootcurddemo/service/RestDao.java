package com.luv2code.springboot.springbootcurddemo.service;

import java.util.List;

import com.luv2code.springboot.springbootcurddemo.entity.Employee;

public interface RestDao {
	
	public List<Employee> getEmployees();

	public Employee findEmployeByid(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployeeByid(int id);
}
