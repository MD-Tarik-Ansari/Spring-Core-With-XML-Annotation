package com.spring.Spring_Core_Xml_With_Annotation.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Spring_Core_Xml_With_Annotation.dto.Product;

public class ProductController 
{
    public static void main(String[] args) 
    {
	     ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	     
	     Product product=(Product) applicationContext.getBean("myproduct");
	     
	     product.display();
	}
}
