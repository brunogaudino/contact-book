package com.gaudino.contactbook;

public class ContactBook {

	private String name;
	private Contact[] contacts;
	
	public ContactBook() {
		// TODO Auto-generated constructor stub
	}
	
	public ContactBook(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact[] getContacts() {
		return contacts;
	}

	public void setContacts(Contact[] contacts) {
		this.contacts = contacts;
	}
	
	public String getInfo() {
		String info = "Name = " + name + "\n";
		
		if (contacts != null) {
			for (Contact c : contacts ) {
				info += c.getInfo() + "\n";		
			}
		}
		
		return info;
	}
	
}
