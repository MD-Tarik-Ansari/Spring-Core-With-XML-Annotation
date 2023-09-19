package com.spring.Spring_Core_Xml_With_Annotation.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Spring_Core_Xml_With_Annotation.dto.Shop;

public class ShopController {

	public static void main(String[] args) 
	{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        
       Shop shop=(Shop) applicationContext.getBean("shop");
       
       shop.displayShop();
	}

}
