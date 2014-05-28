package it.uniroma3.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;
	private String phoneNumber;
	private String email;
	private String vatin;

	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private Address address;
	@ManyToMany (fetch = FetchType.LAZY)
	private List<Product> products;

	public Provider(){}

	public Provider(String name, String phoneNumber, String email,	String vatin, Address address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.vatin = vatin;
		this.address = address;
		this.products = new ArrayList<Product>();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVatin() {
		return vatin;
	}
	public void setVatin(String vatin) {
		this.vatin = vatin;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Provider [id=" + id + ", name=" + name + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", vatin=" + vatin + "]";
	}
}