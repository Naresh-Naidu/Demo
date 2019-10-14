package com.example.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.bean.Employee;
import com.example.dao.DemoRepsi;

@Service
public class DemoService implements DemoSeviceInterface {
	
	//@Resource
	DemoRepsi repo;
	
	Map<String,Integer> demoList=new HashMap<String,Integer>();
	
	public DemoService() {
		demoList.put("Naresh", 1);
		demoList.put("Naidu", 2);
		demoList.put("Manikanth", 3);
		demoList.put("Mahesh", 4);
	} 
	
	@Override
	public ResponseEntity<Object> addDemo(Employee emp) throws Exception{
		repo.save(emp);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
	@Override
	public Map<String,Integer> getAllDemo(){
		return demoList;
	}
	
	
	@Override
	public Integer getDemoByName(String name) throws NullPointerException {
		return demoList.get(name);
	}

	@Override
	public Optional<Employee> getDemoEmployeeByID(Integer id) throws NullPointerException {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
}
