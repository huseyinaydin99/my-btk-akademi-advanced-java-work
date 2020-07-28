package com.huseyinaydin;

public class MSSQLCustomerDal implements ICustomerDal {
	
	private String connectionString;
	
	@Override
	public void add() {
		System.out.println("MSSQL Server veritabanýna kayýt yapýldý.");

	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
