package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.example.bean.Employee;

/*@SpringBootApplication
public class AnotherMain {

	
	@Autowired
	private RestTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(AnotherMain.class, args);
		
	}
	
	public void getTemplate() {
		Employee e=template.getForObject("https://localhost:9090/hello", Employee.class);
		System.out.println(e);
	}
}*/
