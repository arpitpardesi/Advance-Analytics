package com.zensar.day5.assignment.question2;

public class Book {
	
	private int bookID;
	private String bookName;
	private int price;
	private String author;
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book() {
		super();
	}
	
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", price=" + price + ", author=" + author + "]";
	}
	
}
