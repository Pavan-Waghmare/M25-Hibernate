package org.tnsindia.in;

import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService;
import org.tnsindia.service.CustomerServiceimpl;

public class Client {

	public static void main(String[] args) {
		CustomerService service=new CustomerServiceimpl();
		Customer customer=new Customer();
		Scanner s=new Scanner(System.in);
		
		//create operation
		/*customer.setCust_ID(10212);
		customer.setName("vikas");
		customer.setProduct_price(25.77);
		service.addCustomer(customer);
		System.out.println("customer added successfull");*/
		
		//service
		customer=service.getCustomerById(444567);
		System.out.println("Customer id:"+customer.getCust_ID());
		System.out.println("customer name:"+customer.getName());
		System.out.println("customer product-price:"+customer.getProduct_price());
		
		//updation
		/*System.out.println("enter the custID for the updation");
		customer=service.getCustomerById(s.nextInt());
		customer.setName("vikas ghodke");
		service.updateCustomer(customer);
		System.out.println("customer update successfully");*/
		
		//deletion
		System.out.println("enter the cutID for deletion");
		customer=service.getCustomerById(s.nextInt());
		service.deleteCustomer(customer);
		System.out.println("customer deleted successfully");
		
	}

}