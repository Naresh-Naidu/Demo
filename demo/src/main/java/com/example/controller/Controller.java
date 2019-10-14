package com.example.controller;

import java.util.Date;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.example.Service.DemoService;
import com.example.bean.Employee;
import com.example.exception.DemoApplicationException;
import com.example.exception.ErrorDetails;
import com.example.exception.NumbersExceptions;

@RestController
public class Controller {

	
	
	
	@Autowired
	private DemoService service;

	
	@GetMapping("hello")
	@ExceptionHandler(value = {NumbersExceptions.class})
	public ResponseEntity<Object> getMessage(){
		//throw new ArithmeticException();
		Employee e=new Employee();
		e.setId(1);
		e.setName("XXX");
		e.setDepartment("III");
		e.setWorkingLocation("sss");
		return new ResponseEntity<Object>(e, HttpStatus.OK);
   }
	
	@GetMapping(value = "getdemo/{id}")
	@ExceptionHandler(value = {DemoApplicationException.class})
	public ResponseEntity<Object> getDemoByName(@PathVariable Integer id) throws NullPointerException{
		Optional<Employee> emp=service.getDemoEmployeeByID(id);
		System.out.println(emp);
		if(!emp.isPresent()) {
			throw new NullPointerException();
		}
		return new ResponseEntity<Object>(emp, HttpStatus.OK);
	}
	
	@GetMapping("getalldemo")
	public ResponseEntity<Object> getAllDemo(){
		Map<String,Integer> members=service.getAllDemo();
		return new ResponseEntity<Object>(members, HttpStatus.OK);
	}
	
	@PostMapping("adddemo")
	@ExceptionHandler(value = DemoApplicationException.class)
	public ResponseEntity<Object> addDemo(@RequestBody Employee emp) throws Exception{
		return service.addDemo(emp);
	}
	
	
	@GetMapping("login")
	public String login() {
		return "You are not authorizes, you need access..";
	} 
	
	@GetMapping("login-error")
	public String loginError() {
		return "You are not authorizes, you need access..";
	} 
	
	
	
	
	
	 
}
