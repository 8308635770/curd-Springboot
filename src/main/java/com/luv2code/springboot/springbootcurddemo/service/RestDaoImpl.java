package com.luv2code.springboot.springbootcurddemo.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.luv2code.springboot.springbootcurddemo.entity.Contacts;
import com.luv2code.springboot.springbootcurddemo.entity.Employee;


@Repository
public class RestDaoImpl implements RestDao {
	
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	RestTemplate restTemplate;
	
	

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		
		List<Employee>employees=session.createQuery("from Employee",Employee.class).getResultList();
//		contactDao.getAllContacts().stream().filter(i->i.getId()
//		for(int j=0;j<employees.size();j++) {
//			Employee em=employees.get(j);
//			int id=em.getId();
//			List<Contacts>c=contactDao.getAllContacts().stream().filter(i->i.getId()==id).collect(Collectors.toList());
//			if(c!=null && c.size()!=0) {
//				em.setContacts(c);
//			}
//		}
		return employees;
	}



	@Override
	@Transactional
	public Employee findEmployeByid(int id) {
		// TODO Auto-generated method stub
		
		Session session=entityManager.unwrap(Session.class);
		Employee employee=session.get(Employee.class,id);
		
		return employee;
	}



	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		
		
	}



	@Override
	@Transactional
	public void deleteEmployeeByid(int id) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		
		Query query=session.createQuery("delete from Employee where id=:uid");
		
		query.setParameter("uid", id);
		
		query.executeUpdate();

		
	}

}
