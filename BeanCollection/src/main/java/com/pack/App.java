package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	JavaCollection cust = (JavaCollection)context.getBean("CustomerBean");
    	System.out.println("List :"+cust.getEmail());
		System.out.println("Set :"+cust.getPhonenumber());
		System.out.println("Map : "+cust.getMaps());
		
	   }

}
