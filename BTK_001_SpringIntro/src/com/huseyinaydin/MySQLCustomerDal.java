package com.huseyinaydin;

import org.springframework.stereotype.Component;

@Component(value = "database")
public class MySQLCustomerDal implements ICustomerDal {

	private String connectionString;
	
	@Override
	public void add() {
		System.out.println("MySQL veritabanýna eklendi");

	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
