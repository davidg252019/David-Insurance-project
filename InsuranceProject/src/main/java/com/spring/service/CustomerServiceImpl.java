package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Customer;
import com.spring.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	private CustomerDao dao;
	
	public int addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

}