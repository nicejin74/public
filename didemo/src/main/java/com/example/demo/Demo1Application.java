package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.example.AppConfig;
import com.example.app.Calculator;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class Demo1Application {

	public static void main(String[] args) {
//		SpringApplication.run(Demo1Application.class, args);
		try(ConfigurableApplicationContext context= SpringApplication.run(Demo1Application.class, args))
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 2 nuber like 'a b':");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			Calculator cal = context.getBean(Calculator.class);
			int res = cal.calc(a, b);
			
			System.out.println("res = "+res);
		}
	}

}
