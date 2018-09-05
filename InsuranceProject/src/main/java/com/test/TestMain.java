package com.test;

import java.util.ArrayList;
import java.util.List;

import com.spring.dao.CustomerDao;
import com.spring.dao.CustomerDaoImpl;
import com.spring.model.Customer;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerDao dao = new CustomerDaoImpl();
		
		Customer c = new Customer(1, 1234567890, "Dude", "Bro", "email", "pass123");
		//dao.addNewCustomer(c);
		
		//List<Customer> custs = dao.viewAllCustomers();
		
		List<Customer> custs = new ArrayList<Customer>();
		
		custs.add(c);
		
		for (Customer d : custs)
		{
			System.out.println(d.getFirstName());
		}
	}

}
