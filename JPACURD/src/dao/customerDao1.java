package org.tnsindia.dao;

import javax.persistence.EntityManager;

import org.tnsindia.entities.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	private EntityManager em;

	public CustomerDaoImpl() {
		super();
		em=JPAutil.getEntityManager();
	}

	@Override
	public void addCustomer(Customer customer) {
		em.persist(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		em.merge(customer);
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		em.remove(customer);
		
	}

	@Override
	public Customer getCustomerById(int cust_ID) {
		Customer customer=em.find(Customer.class, cust_ID);
		return customer;
	}

	@Override
	public void begintransation() {
		em.getTransaction().commit();
		
	}

	@Override
	public void commitTransation() {
		em.getTransaction().begin();
		
	}

}