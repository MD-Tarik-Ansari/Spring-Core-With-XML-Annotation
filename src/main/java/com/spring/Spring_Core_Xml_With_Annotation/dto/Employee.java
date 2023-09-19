package com.spring.Spring_Core_Xml_With_Annotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "emp")
public class Employee 
{
   private int id;
   private String name;
   private String email;
   
   //constructor Injection

public Employee(@Value(value = "123")int id, @Value(value = "rahul")String name, @Value(value = "rahul@gmail.com")String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
   public void displayEmployee()
   {
	   System.out.println("EmpId is : "+id);
	   System.out.println("EmpName is : "+name);
	   System.out.println("EmpEmail is : "+email);
   }
}
