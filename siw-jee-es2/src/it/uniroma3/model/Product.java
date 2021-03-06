package it.uniroma3.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@NamedQuery(name = "findAllProducts", query = "SELECT p FROM Product p")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	private Float price;

	@Column(length = 2000)
	private String description;

	@Column(unique= true, nullable = false)
	private String code;
	
	@ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private List<Provider> providers;


	public Product() {
	}

	public Product(String name, Float price, String description, String code) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.code = code;
		this.providers = new ArrayList<Provider>();
	}

	//          Getters & Setters        

	public Long getId() {
		return id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public boolean equals(Object obj) {
		Product product = (Product)obj;
		return this.getCode().equals(product.getCode());
	}

	public int hashCode() {
		return this.code.hashCode();
	}

	public void setId(Long id) {
		this.id = id;
	}

}