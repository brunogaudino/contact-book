package com.gaudino.contactbook;

public class Contact {
	
	private String name;
	private String telephone;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getInfo() {
		return "Name = " + name + ";" + 
			   "Telephone = " + telephone + ";" +
			   "Email = " + email;
	}
}
