package com.huseyinaydin;

public class CustomerManager implements ICustomerService {
	private ICustomerDal customerDal;
	
	public CustomerManager() {
		// TODO Auto-generated constructor stub
	}

	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		//iþ metodu(kurallarý)
		customerDal.add();
	}

	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
}
