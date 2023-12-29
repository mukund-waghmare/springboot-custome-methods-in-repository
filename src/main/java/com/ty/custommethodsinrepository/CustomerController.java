package com.ty.custommethodsinrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	
	@Autowired
	CustomerRepository repository;
	
	@GetMapping("/save")
	public Customer save(@RequestBody Customer customer)
	{
		repository.save(customer);
		return customer;
	}
	
	@GetMapping("/findByName")
	public String findByName(@PathVariable String name)
	{
		repository.findByName(name);
		return name;
	}
	
	

}
