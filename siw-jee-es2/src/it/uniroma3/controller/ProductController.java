package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Product;
import it.uniroma3.model.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "productController")

public class ProductController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private Float price;
	private String description;
	private String code;
	private Product product;
	private List<Product> products;

	@EJB
	private ProductFacade productFacade;

	public String deleteProduct(){
		productFacade.deleteProduct(id);
		this.products = productFacade.getAllProducts();
		return "products";
	}

	public String updateProduct(){
		this.product = productFacade.getProduct(id);

		return "update";
	}

	public String createProduct() {
		this.product = productFacade.createProduct(name, code, price, description);
		return "product"; 
	}

	public String listProducts() {
		this.products = productFacade.getAllProducts();
		return "products"; 
	}
	
	public String viewProducts() {
		this.products = productFacade.getAllProducts();
		return "viewProducts"; 
	}
	
	public String orderProducts() {
		this.products = productFacade.getAllProducts();
		return "orderProducts"; 
	}
	
	public String findProduct() {
		this.product = productFacade.getProduct(id);
		return "product";
	}

	public String findProduct(Long id) {
		this.product = productFacade.getProduct(id);
		return "product";
	}
	
	public Product findByCodeProduct(String code){
		this.product = productFacade.getByCodeProduct(code);
		return this.product;
	}
	
	public String setQuantityProduct(){
		this.product = productFacade.getProduct(id);
		return "productInCart";
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}


