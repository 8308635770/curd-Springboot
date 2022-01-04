package com.luv2code.springboot.springbootcurddemo.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.springbootcurddemo.entity.Employee;
import com.luv2code.springboot.springbootcurddemo.service.RestDao;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	RestDao restDao;

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return restDao.getEmployees();
	}

	@Override
	public Employee findEmployeByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployeeByid(int id) {
		// TODO Auto-generated method stub

	}

}
