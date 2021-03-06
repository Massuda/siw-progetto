package it.uniroma3.controller;


import java.util.Date;
import java.util.List;

import it.uniroma3.model.Customer;
import it.uniroma3.model.CustomerFacade;
import it.uniroma3.model.OrderFacade;
import it.uniroma3.model.OrderLine;
import it.uniroma3.model.Order;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="orderController")
@SessionScoped
public class OrderController {
	

	/**
	 * 
	 */
	
	private Long id;
	private String prova;
    private Date creationtime;
    private Customer customer;
    private List<OrderLine> orderLines;
	
	private Order order;
	private List<Order> orders;
	
	@EJB
	private OrderFacade orderFacade;
	
    @ManagedProperty(value="#{customerController}")
    private CustomerController customerController;
	
	public String deleteOrder(){
		orderFacade.deleteOrder(id);
		this.orders = orderFacade.getAllOrders();
		return "orders";
	}
	
	public String updateOrder(){
		this.order = orderFacade.getOrder(id);		
		return "update";
	}
	
		
	public CustomerController getCustomerController() {
		return customerController;
	}

	public void setCustomerController(CustomerController customerController) {
		this.customerController = customerController;
	}
	
	public void setCustomerOrder(){
		//Customer c=customerController.getCustomer();
		this.customer = customerController.getCustomer();
		//return "prova"; 
	}
	
	public String provaOrder(){
		//Customer c=customerController.getCustomer();
		this.customer = customerController.getCustomer();
		return "prova"; 
	}

	public String createOrder(){
		//Customer c=customerController.getCustomer();
		this.customer = customerController.getCustomer();
		this.order = orderFacade.createOrder(customer);
		return "order"; 
	}
	
	public String listOrder() {
		this.orders = orderFacade.getAllOrders();
		return "orders"; 
	}

	public String findOrder() {
		this.order = orderFacade.getOrder(id);
		return "order";
	}
	
	public String findOrder(Long id) {
		this.order = orderFacade.getOrder(id);
		return "order";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public OrderFacade getOrderFacade() {
		return orderFacade;
	}

	public void setOrderFacade(OrderFacade orderFacade) {
		this.orderFacade = orderFacade;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void aggiungimi(){
		this.customer.getOrders().add(this.order);
	}

	public String getProva() {
		return prova;
	}

	public void setProva(String prova) {
		this.prova = prova;
	}
	
	
	
}


