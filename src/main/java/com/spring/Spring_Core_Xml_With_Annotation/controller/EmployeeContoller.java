package com.spring.Spring_Core_Xml_With_Annotation.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Spring_Core_Xml_With_Annotation.dto.Employee;

public class EmployeeContoller {

	public static void main(String[] args) 
	{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        
        Employee employee=(Employee) applicationContext.getBean("emp");
        
        employee.displayEmployee();
	}

}
