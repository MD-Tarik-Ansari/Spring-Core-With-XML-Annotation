package com.spring.Spring_Core_Xml_With_Annotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "engine")
public class Engine 
{
    private int id;
    private String name;
    private double hp;
	public Engine(@Value(value = "1001") int id, @Value(value = "abc") String name, @Value(value = "45") double hp) {
		super();
		this.id = id;
		this.name = name;
		this.hp = hp;
	}
    
    public void displayEngine()
    {
    	System.out.println("EngineId is : "+id);
    	System.out.println("EngineName is : "+name);
    	System.out.println("EngineHorsePower is : "+hp);
    }
}
