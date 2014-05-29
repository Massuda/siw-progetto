package it.uniroma3.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Stateless
public class OrderLineFacade {
	
    @PersistenceContext(unitName = "unit-jee-es2")
    private EntityManager em;
    
	public OrderLine createOrderLine(Product product, int quantity) {
		OrderLine orderLine = new OrderLine(product, quantity);
		em.persist(orderLine);
		return orderLine;
	}
	
	public OrderLine getOrderLine(Long id) {
		OrderLine orderLine = em.find(OrderLine.class, id);
		return orderLine;
	}
	
	public List<OrderLine> getAllOrderLines() {
        CriteriaQuery<OrderLine> cq = em.getCriteriaBuilder().createQuery(OrderLine.class);
        cq.select(cq.from(OrderLine.class));
        List<OrderLine> orderLine = em.createQuery(cq).getResultList();
		return orderLine;
	}

	public void updateOrderLine(OrderLine orderLine) {
        em.merge(orderLine);
	}
	
	public OrderLine updateOrderLine(Long id) {
		OrderLine orderLine = em.find(OrderLine.class, id);
		updateOrderLine( orderLine);
		return orderLine;
	}
	
    private void deleteOrderLine(OrderLine orderLine) {
        em.remove(orderLine);
    }

	public void deleteOrderLine(Long id) {
		OrderLine orderLine = em.find(OrderLine.class, id);
        deleteOrderLine(orderLine);
	}
		
}