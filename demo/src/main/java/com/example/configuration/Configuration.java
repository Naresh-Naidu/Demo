package com.example.configuration;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.client.RestTemplate;

import com.example.bean.Employee;
import com.example.dao.DemoRepsi;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
