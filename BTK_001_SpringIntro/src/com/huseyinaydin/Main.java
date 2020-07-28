package com.huseyinaydin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService iCustomerService = context.getBean("iCustomerManager",CustomerManager.class);
		
		iCustomerService.add();

	}

}
