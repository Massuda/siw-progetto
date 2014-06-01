package it.uniroma3.controller;
import it.uniroma3.model.Customer;
import it.uniroma3.model.CustomerFacade;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import it.uniroma3.model.Address;
import it.uniroma3.model.Order;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="customer")
public class CustomerController {

	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	private Date dateOfBirth;
	private Date registrationDate;
	private Address address;
	private List<Order> orders;
	private Customer customer;
	private List<Customer> customers;

	@EJB
	private CustomerFacade customerFacade;

	public String deleteCustomer(){
		customerFacade.deleteCustomer(id);
		this.customers = customerFacade.getAllCustomers();
		return "customers";
	}

	public String createCustomer() {
		this.customer = customerFacade.createCustomer(firstName,lastName,email,password,phoneNumber,dateOfBirth,address);
		return "customerHome"; 
	}

	public String listCustomers() {
		this.customers = customerFacade.getAllCustomers();
		return "customers"; 
	}

	public String findCustomer() {
		this.customer = customerFacade.getCustomer(id);
		return "customers";
	}

	public String findCustomer(Long id) {
		this.customer = customerFacade.getCustomer(id);
		return "customer";
	}

	public String customerLogin(){
		String nextPage = "loginError";
		try{ 
			Customer customer = customerFacade.checkEmail(email);
			if(customer.checkPassword(this.password)){
				this.customer = customer;
				return "customerHome";
			}
		}
		catch (Exception e){
		}
		return nextPage;
	}
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public CustomerFacade getCustomerFacade() {
		return customerFacade;
	}

	public void setCustomerFacade(CustomerFacade customerFacade) {
		this.customerFacade = customerFacade;
	}

}


