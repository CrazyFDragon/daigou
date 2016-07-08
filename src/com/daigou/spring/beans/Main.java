package com.daigou.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Create IOC container object
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Get bean entity from IOC container
		HelloWorld helloworld = (HelloWorld) ctx.getBean("helloworld");
		helloworld.hello();
	}


}
