package it.uniroma3.model;

import javax.persistence.*;

@Entity
@Table(name = "order_line")
public class OrderLine {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne (fetch = FetchType.EAGER)
    private Product product;
    
    @Column(nullable = false)
    private int quantity;
    
    @Column(nullable = false)
    private Float price;
    
    public OrderLine(){}
    
    public OrderLine(Product product, int quantity){
    	this.product = product;
    	this.quantity = quantity;
    	this.price = product.getPrice()*quantity;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderLine [product=" + product.getName() + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
    
    
}
