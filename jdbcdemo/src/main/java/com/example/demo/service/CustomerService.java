package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.domain.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao cDao;
	
	public Customer save(Customer c)
	{
		return cDao.save(c);
	}
	
	public List<Customer> findAll()
	{
		return cDao.findAll();
	}
}
