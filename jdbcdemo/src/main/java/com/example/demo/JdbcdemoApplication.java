package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@EnableAutoConfiguration
@ComponentScan
public class JdbcdemoApplication implements CommandLineRunner{

	@Autowired
	CustomerService cService;
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcdemoApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		cService.save(new Customer(1,"BS","JIN"));
		cService.save(new Customer(2,"HR","JIN"));
		cService.save(new Customer(3,"EY","JIN"));
		
		cService.findAll().forEach(System.out::println);
		
	}

}
