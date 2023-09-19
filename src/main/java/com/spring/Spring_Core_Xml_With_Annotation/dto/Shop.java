package com.spring.Spring_Core_Xml_With_Annotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//variable Injection

@Component(value = "shop")
public class Shop 
{
	@Value(value = "1001")
    private int shopId;
	@Value(value = "Amit csc center")
    private String shopName;
	@Value(value = "Amit")
    private String shopOwner;
	@Value(value = "50000")
    private double shopTurnOver;
    
    public void displayShop()
    {
    	System.out.println("ShopId is : "+shopId);
    	System.out.println("ShopName is : "+shopName);
    	System.out.println("ShopOwner is : "+shopOwner);
    	System.out.println("ShopTurnOver is : "+shopTurnOver);
    }
}
