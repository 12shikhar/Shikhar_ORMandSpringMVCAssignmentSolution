package com.greatlearning.javafsd.customertracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.javafsd.customertracker.entity.Customer;



@Service
public interface CustomerService {
	
	List<Customer> listAll();
	
	void save(Customer customer);
	
	Customer findById(int id);
	
	void deleteById(int theid);

}



