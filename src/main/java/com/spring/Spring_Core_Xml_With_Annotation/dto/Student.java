package com.spring.Spring_Core_Xml_With_Annotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "student")
public class Student 
{
	@Value(value = "101")
    private int id;
	@Value(value = "Mohan")
    private String name;
	@Value(value = "mohan@gmail.com")
    private String email;
    
    public void display()
    {
    	System.out.println("Id is : "+id);
    	System.out.println("Name is : "+name);
    	System.out.println("Email is : "+email);
    }
}
