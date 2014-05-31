package it.uniroma3.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Stateless
public class CustomerFacade {

	@PersistenceContext(unitName = "unit-jee-es2")
	private EntityManager em;

	public Customer createCustomer(String firstName, String lastName, String email, String password, String phoneNumber, Date dateOfBirth, Address address) {
		Customer customer = new Customer( firstName,  lastName,  email, password, phoneNumber,  dateOfBirth, address);
		em.persist(customer);
		return customer;
	}

	public Customer getCustomer(Long id) {
		Customer customer = em.find(Customer.class, id);
		return customer;
	}

	public List<Customer> getAllCustomers() {
		CriteriaQuery<Customer> cq = em.getCriteriaBuilder().createQuery(Customer.class);
		cq.select(cq.from(Customer.class));
		List<Customer> customers = em.createQuery(cq).getResultList();
		return customers;
	}

	public void updateCustomer(Customer customer) {
		em.merge(customer);
	}

	public Customer updateCustomer(Long id) {
		Customer customer = em.find(Customer.class, id);
		updateCustomer( customer);
		return customer;
	}

	private void deleteCustomer(Customer customer) {
		em.remove(customer);
	}

	public void deleteCustomer(Long id) {
		Customer customer = em.find(Customer.class, id);
		deleteCustomer(customer);
	}

	public Collection<Product> findByName(String name){
		Query query=em.createQuery("SELECT * FROM Product p WHERE p.name="+name);
		query.setParameter("findByName", name);
		List<Product> products = query.getResultList();
		return products;
	}

	 
	public Customer checkEmail(String email){
		Query query = em.createQuery("SELECT c FROM Customer c WHERE c.email =:email");
		query.setParameter("email",  email);
		return (Customer)query.getSingleResult();
	}
	
	
	
	
}