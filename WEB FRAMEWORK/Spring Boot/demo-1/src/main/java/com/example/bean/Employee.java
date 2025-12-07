package com.example.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


//Now after adding JPA dependency, this entity class is mapped to the employee table in the mysql 
//using below annotations @entity, @Id, @GenerateedValue


// My mic is not working mam

@Entity
public class Employee {
	
	@Id
    int id;
    String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
    
    
}
