package com.luv2code.springboot.springbootcurddemo.service;

import java.util.List;

import com.luv2code.springboot.springbootcurddemo.entity.Contacts;
import com.luv2code.springboot.springbootcurddemo.entity.Employee;

public interface ContactsDao {
	
	public List<Contacts> getAllContacts();
	
	

}
