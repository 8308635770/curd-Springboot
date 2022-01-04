package com.luv2code.springboot.springbootcurddemo.service;

import java.util.ArrayList;
import java.util.List;

import com.luv2code.springboot.springbootcurddemo.entity.Contacts;

public class ContactsDaoImpl implements ContactsDao{
	
	List<Contacts>contactList=new ArrayList<>();
	
	

	@Override
	public List<Contacts> getAllContacts() {
		// TODO Auto-generated method stub
		contactList.add(new Contacts(1, "shivam1", "Tapdiya1"));
		contactList.add(new Contacts(1, "shivam1", "Tapdiya1"));
		contactList.add(new Contacts(2, "shivam2", "Tapdiya2"));
		contactList.add(new Contacts(2, "shivam2", "Tapdiya2"));
		contactList.add(new Contacts(3, "shivam3", "Tapdiya3"));
		contactList.add(new Contacts(3, "shivam3", "Tapdiya3"));
		contactList.add(new Contacts(4, "shivam4", "Tapdiya4"));
		contactList.add(new Contacts(4, "shivam4", "Tapdiya4"));

		
		return contactList;
	}

}
