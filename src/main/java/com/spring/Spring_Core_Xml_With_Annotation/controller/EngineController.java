package com.spring.Spring_Core_Xml_With_Annotation.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Spring_Core_Xml_With_Annotation.dto.Engine;

public class EngineController {

	public static void main(String[] args) 
	{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        
        Engine engine=(Engine) applicationContext.getBean("engine");
        
        engine.displayEngine();
	}

}
