package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.OrderLine;
import it.uniroma3.model.OrderLineFacade;
import it.uniroma3.model.Product;
import it.uniroma3.model.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@ManagedBean
public class OrderLineController {
	
	@ManagedProperty(value="#{param.id}")
    private Long id;
    private Product product;
    private int quantity;
    private Float price;
	private OrderLine orderLine;
	private List<OrderLine> orderLines;
	
	@EJB
	private OrderLineFacade orderLineFacade;
	
	public String createOrderLine() {
		this.orderLine = orderLineFacade.createOrderLine(product, quantity);
		return "orderLine"; 
	}
	
	public String deleteOrderLine(){
		orderLineFacade.deleteOrderLine(id);
		this.orderLines = orderLineFacade.getAllOrderLines();
		return "orderLines";
	}
	
	public String updateOrderLine(){
		this.orderLine = orderLineFacade.getOrderLine(id);		
		return "update";
	}
	
	public String listOrderLines() {
		this.orderLines = orderLineFacade.getAllOrderLines();
		return "orderLines"; 
	}

	public String findOrderLine() {
		this.orderLine = orderLineFacade.getOrderLine(id);
		return "orderLines";
	}
	
	public String findOrderLine(Long id) {
		this.orderLine = orderLineFacade.getOrderLine(id);
		return "orderLine";
	}
	
	public void setProductOrderLine(String code){
		this.product = orderLineFacade.findProductByCode(code);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
}


