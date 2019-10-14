package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import com.example.bean.Employee;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoApplications {

	
	@Autowired
	private RestTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplications.class, args);
		
	}
	
	public void getTemplate() {
		Employee e=template.getForObject("localhost:9090/hello", Employee.class);
		System.out.println(e);
	}
}
