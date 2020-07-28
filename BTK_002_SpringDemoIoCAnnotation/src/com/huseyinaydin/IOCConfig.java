package com.huseyinaydin;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.huseyinaydin")
@PropertySource("classpath:values.properties")
public class IOCConfig implements ApplicationContextAware {
	
	private ApplicationContext context;
	
	@Bean(name = "database")
	public ICustomerDal getDatabase() {
		return new MySQLCustomerDal();
	}
	
	@Bean(name = "service")
	public ICustomerService service() {
		return new CustomerManager(context.getBean("database", MySQLCustomerDal.class));
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
	}
}
