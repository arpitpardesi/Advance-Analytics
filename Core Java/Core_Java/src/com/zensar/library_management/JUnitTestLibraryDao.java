package com.zensar.library_management;

import java.util.List;

import org.junit.Test;

public class JUnitTestLibraryDao {

	Library library = new Library();
	LibraryDao libraryDao = new LibraryDaoImpl();
/*
	public static void main(String[] args) {
		LibraryDao libraryDao = new LibraryDaoImpl(); 

	    //testAddBook(new Library(3, "GHI", "GHI", 100 ,"Not Available") , libraryDao);
		//testDelBook(3, libraryDao);
		//testGetBook(2, libraryDao);
		//testGetAllBook(libraryDao);
		//testUpdateBook(new Library(3, "GHI", "GHI", 100 ,"Available"), libraryDao);
		//testGetBookStatus(2, libraryDao);
	}
*/
	@Test
	public void testAddBook() {

		int result = libraryDao.addBook(new Library(3, "GHI", "GHI", 100 ,"Not Available"));
		//int result = libraryDao.addBook(new Library(4, "JKL", "JKL", 1000 ,"Available"));
		if (result == 0) {
			System.out.println("Addition Failed");
		} else {
			System.out.println("Addition Successful");
		}
	}

	@Test
	public void testDelBook() {
		int bookId = 4;
		//int bookId = 3;
		int result = libraryDao.deleteBook(bookId);
		if (result == 0) {
			System.out.println("Deletion Failed");
		} else {
			System.out.println("Deletion Successful");
		}
	}

	@Test
	public void testGetBook() {
		int bookId = 1;
		Library library = libraryDao.getBook(bookId);
		System.out.println(library);
	}

	@Test
	public void testGetAllBook() {
		List<Library> allBook = libraryDao.getAllBooks();
		System.out.println(allBook);
	}

	@Test
	public void testUpdateBook() {
		int result = libraryDao.updateBook(new Library(3, "GHI", "GHI", 100 ,"Available"));
		//int result = libraryDao.updateBook(new Library(4, "JKL", "JKL", 1000 ,"Not Available"));
		if (result == 0) {
			System.out.println("Updation Failed");
		} else {
			System.out.println("Updation Successful");
		}
	}
	
	@Test
	public void testGetBookStatus() {
		int bookId = 1;
		int result = libraryDao.bookStatus(bookId);
		if (result == 0) {
			System.out.println("Book Status: Not Available");
		} else {
			System.out.println("Book Status: Available");
		}
	}

}
