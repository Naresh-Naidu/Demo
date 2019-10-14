package com.example.Service;

import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.bean.Employee;

public interface DemoSeviceInterface {

	
	public ResponseEntity<Object> addDemo(Employee emp) throws Exception;
	
	public Map<String,Integer> getAllDemo();
	
	public Integer getDemoByName(String name) throws NullPointerException ;
	
	Optional<Employee> getDemoEmployeeByID(Integer id) throws NullPointerException;
	
}
