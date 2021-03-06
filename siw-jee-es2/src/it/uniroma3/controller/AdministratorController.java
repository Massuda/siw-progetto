package it.uniroma3.controller;

import java.util.List;


import it.uniroma3.model.Administrator;
import it.uniroma3.model.AdministratorFacade;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class AdministratorController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Administrator administrator;
	private List<Administrator> administrators;
	
	@EJB
	private AdministratorFacade administratorFacade;
	
	public String createAdministrator(){
		this.administrator = administratorFacade.createAdministrator(firstName, lastName, email, password);
		return "administrator";
	}
	
	public String findAdministratorByEmail(){
		this.administrator = administratorFacade.getAdministratorByMail(email);
		return "administrator";
	}
	
	public String findAdministrator(Long id){
		this.administrator = administratorFacade.getAmministratore(id);
		return "administrator";
	}
	
	public String administratorLogin(){
		String nextPage = "administratorLoginError";
		try{ 
			Administrator administrator = administratorFacade.checkEmail(email);
			if(administrator.checkPassword(this.password)){
				this.administrator = administrator;
				return "administratorHome";
			}
		}
		catch (Exception e){
		}
		return nextPage;
	}
	
	// Getter e Setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return firstName;
	}

	public void setNome(String nome) {
		this.firstName = nome;
	}

	public String getCognome() {
		return lastName;
	}

	public void setCognome(String cognome) {
		this.lastName = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public List<Administrator> getAdministrators() {
		return administrators;
	}

	public void setAdministrator(List<Administrator> administrators) {
		this.administrators = administrators;
	}
		
}