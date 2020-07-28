package com.huseyinaydin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCConfig.class);
		/*ICustomerDal customerDal = context.getBean("database",MySQLCustomerDal.class);
		customerDal.add();*/
		ICustomerService service = context.getBean("service",CustomerManager.class);
		service.add();
		System.out.println("selam");
	}
}
