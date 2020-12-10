package com.gaudino.contactbook;

import java.util.Scanner;

public class LabsContacContactBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Enter with contact book name: ");
			String name = scan.nextLine();
			
			ContactBook contactBook = new ContactBook(name);
			
			Contact[] contacts = new Contact[3];
			
			for (int i = 0; i < contacts.length; i++) {
				
				System.out.println("Enter with contact information " + (i+1));
				Contact c = new Contact();
				
				System.out.println("Enter with name: ");
				name = scan.nextLine();
				c.setName(name);
				
				System.out.println("Enter with telephone: ");
				String telephone = scan.nextLine();
				c.setTelephone(telephone);
				
				System.out.println("Enter with email: ");
				String email = scan.nextLine();
				c.setEmail(email);
				
				contacts[i] = c;
			}
			
			contactBook.setContacts(contacts);
			
			if (contactBook != null) {
				System.out.println(contactBook.getInfo());				
			}
		}
		
		
	}

}
