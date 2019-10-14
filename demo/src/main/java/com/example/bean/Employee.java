package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column( name = "department")
	private String department;
	
	@NotNull
	@Column(name = "odc")
	private String workingLocation;
	
	public Employee() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getWorkingLocation() {
		return workingLocation;
	}
	public void setWorkingLocation(String workingLocation) {
		this.workingLocation = workingLocation;
	}
	
	
	
}
