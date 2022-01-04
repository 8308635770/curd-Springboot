package com.luv2code.springboot.springbootcurddemo.serviceLayer;

import java.util.List;

import com.luv2code.springboot.springbootcurddemo.entity.Employee;



public interface EmployeeService {
	
	public List<Employee> getEmployees();

	public Employee findEmployeByid(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployeeByid(int id);
}
