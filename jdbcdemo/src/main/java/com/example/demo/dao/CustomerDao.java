package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Customer;

@Repository
public class CustomerDao {
	private final ConcurrentMap<Integer, Customer> cMap =new ConcurrentHashMap<>() ;
	
	public List<Customer> findAll()
	{
		return new ArrayList<>(cMap.values());
	}
	
	public Customer findOne(Integer cId)
	{
		return cMap.get(cId);
	}
	
	public Customer save(Customer c)
	{
		return cMap.put(c.getId(), c);
	}
	
	public void delect (Integer cId)
	{
		cMap.remove(cId);
	}
	
}
