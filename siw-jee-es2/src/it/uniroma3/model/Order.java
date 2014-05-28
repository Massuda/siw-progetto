package it.uniroma3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
	
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;	
    
    @Temporal (TemporalType.TIMESTAMP)
    private Date creationtime;

    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "orders_id")
    private List<OrderLine> orderLines;

    
    public Order(){}
    
    public Order(Date creationtime){
    	this.creationtime = creationtime;
    	this.orderLines = new ArrayList<OrderLine>();
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
    
    
    
}
