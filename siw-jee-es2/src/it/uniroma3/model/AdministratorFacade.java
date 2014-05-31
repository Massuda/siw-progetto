package it.uniroma3.model;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class AdministratorFacade {
	@PersistenceContext(unitName= "unit-jee-es2")
	private EntityManager em;
	
	public Administrator createAdministrator(String firstName, String lastName, String email, String password){
		Administrator administrator = new Administrator(firstName, lastName, email, password);
		em.persist(administrator);
		return administrator;
	}

	public Administrator getAdministratorByMail(String email) {
		Administrator administrator = em.find(Administrator.class, email);
		return administrator;
	}
	
	public Administrator getAmministratore(Long id){
		Administrator amministratore = em.find(Administrator.class, id);
		return amministratore;
	}
	
	public Administrator checkEmail(String email){
		Query query = em.createQuery("SELECT a FROM Amministratore a WHERE a.email =:email");
		query.setParameter("email",  email);
		return (Administrator)query.getSingleResult();
	}

}