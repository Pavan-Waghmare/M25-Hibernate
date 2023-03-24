package org.tnsindia.service;

import org.tnsindia.dao.CustomerDaoImpl;
import org.tnsindia.entities.Customer;

public class CustomerServiceimpl implements CustomerService{
	private CustomerDaoImpl dao;
	
	

	public CustomerServiceimpl() {
		super();
		dao=new CustomerDaoImpl();
	}

	@Override
	public void addCustomer(Customer customer) {
		dao.begintransation();
		dao.addCustomer(customer);
		dao.commitTransation();
		
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		dao.begintransation();
		dao.updateCustomer(customer);
		dao.commitTransation();
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		dao.begintransation();
		dao.deleteCustomer(customer);
		dao.commitTransation();
		
	}

	@Override
	public Customer getCustomerById(int cust_ID) {
		Customer customer=dao.getCustomerById(cust_ID);
		return customer;
	}

}