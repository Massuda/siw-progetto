package it.uniroma3.controller;


import java.util.List;
import it.uniroma3.model.Address;
import it.uniroma3.model.AddressFacade;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
//add


@ManagedBean
public class AddressController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private Address address;
	private List<Address> addresses;
	private AddressFacade addressFacade;
	
	
	public String deleteAddress(){
		addressFacade.deleteAddress(id);
		this.addresses = addressFacade.getAllAddresses();
		return "orders";
	}
	
	public String updateAddress(){
		this.address = addressFacade.getAddress(id);
		
		return "update";
	}
		
	public String createAddress(String street, String city, String state, String zipcode, String country) {
		this.address = addressFacade.createAddress( street, city, state, zipcode, country);
		return "address"; 
	}
	
	public String listAddress() {
		this.addresses = addressFacade.getAllAddresses();
		return "addresses"; 
	}

	public String findAddress() {
		this.address = addressFacade.getAddress(id);
		return "address";
	}
	
	public String findAddress(Long id) {
		this.address = addressFacade.getAddress(id);
		return "address";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public AddressFacade getAddressFacade() {
		return addressFacade;
	}

	public void setAddressFacade(AddressFacade addressFacade) {
		this.addressFacade = addressFacade;
	}

	
	
}


