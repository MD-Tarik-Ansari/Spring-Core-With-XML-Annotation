package com.spring.Spring_Core_Xml_With_Annotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "pen")
public class Pen 
{
    private int id;
    private String name;
    private double price;
    
    @Value(value = "101")
	public void setId(int id) {
		this.id = id;
	}
    @Value(value = "DotPen")
	public void setName(String name) {
		this.name = name;
	}
    @Value(value = "10")
	public void setPrice(double price) {
		this.price = price;
	}
    public void displayPen()
    {
    	System.out.println("PenId is : "+id);
    	System.out.println("PenName is : "+name);
    	System.out.println("PenPrice is : "+price);
    }
}
