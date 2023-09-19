package com.spring.Spring_Core_Xml_With_Annotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myproduct")
public class Product 
{
	
   private int id;
   private String name;
   private String company;
   private double price;
   
	@Value(value = "101")
   public void setId(int id) {
		this.id = id;
	}
	@Value(value = "Mobile")
	public void setName(String name) {
		this.name = name;
	}
	@Value(value = "Samsung")
	public void setCompany(String company) {
		this.company = company;
	}
	@Value(value = "13000")
	public void setPrice(double price) {
		this.price = price;
	}
   public void display()
   {
	   System.out.println("ProductId is : "+id);
	   System.out.println("ProductName is : "+name);
	   System.out.println("ProductCompany is : "+company);
	   System.out.println("ProductPrice is : "+price);
   }
}
