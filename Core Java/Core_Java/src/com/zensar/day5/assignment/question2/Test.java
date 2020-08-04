package com.zensar.day5.assignment.question2;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setBookID(1);
		book1.setBookName("The Universe in a Nutshell");
		book1.setPrice(400);
		book1.setAuthor("Stephen Hawking");
		
		
		Book book2 = new Book();
		book2.setBookID(1);
		book2.setBookName("Book");
		book2.setPrice(2);
		book2.setAuthor("ABC");
		
		Set<Book> setOfBooks = new HashSet<Book>();
		setOfBooks.add(book1);
		setOfBooks.add(book2);
		
		try {
			display(setOfBooks);
		} catch (PriceTooLowException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}

	private static void display(Set<Book> setOfBooks) throws PriceTooLowException {
		// TODO Auto-generated method stub
		for(Book b : setOfBooks) {
			if(b.getPrice() > 5) {
				System.out.println(b);
			}
			else {
				throw new PriceTooLowException(b.getPrice());
			}
		}
		
	}
}
