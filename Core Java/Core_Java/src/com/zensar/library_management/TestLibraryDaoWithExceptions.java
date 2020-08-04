package com.zensar.library_management;

import java.util.List;

public class TestLibraryDaoWithExceptions {

	public static void main(String[] args) {
		LibraryDao libraryDao = new LibraryDaoImpl(); 

		// Will throw expection when we try to add book with price less than 100.
	    try {
			testAddBook(new Library(3, "GHI", "GHI", 10 ,"Not Available") , libraryDao);
		} catch (PriceTooLowException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	    //testDelBook(3, libraryDao);
		
	    
	    // Will throw exception when the status of the book is not available.
		try {
			
			testGetBook(2, libraryDao);
		
		} catch (BookNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//testGetAllBook(libraryDao);
		//testUpdateBook(new Library(3, "GHI", "GHI", 100 ,"Available"), libraryDao);
		//testGetBookStatus(2, libraryDao);
	}

	public static void testAddBook(Library library, LibraryDao libraryDao) throws PriceTooLowException {

		int result = libraryDao.addBook(library);
		if (result == 0) {
			System.out.println("Addition Failed");
		} else {
			if(library.getBookPrice() < 100) {
				throw new PriceTooLowException();
			}
		}
	}

	public static void testDelBook(int bookId, LibraryDao libraryDao) {
		int result = libraryDao.deleteBook(bookId);
		if (result == 0) {
			System.out.println("Deletion Failed");
		} else {
			System.out.println("Deletion Successful");
		}
	}

	public static void testGetBook(int bookId, LibraryDao libraryDao) throws BookNotAvailableException {
		Library library = libraryDao.getBook(bookId);
		if(library.getBookStatus().equals("Available")) {
			System.out.println(library);
		}
		else {
			throw new BookNotAvailableException();
		}
		
	}

	public static void testGetAllBook(LibraryDao libraryDao) {
		List<Library> allBook = libraryDao.getAllBooks();
		System.out.println(allBook);
	}

	public static void testUpdateBook(Library library, LibraryDao libraryDao) {
		int result = libraryDao.updateBook(library);
		if (result == 0) {
			System.out.println("Updation Failed");
		} else {
			System.out.println("Updation Successful");
		}
	}
	
	public static void testGetBookStatus(int bookId, LibraryDao libraryDao) {
		int result = libraryDao.bookStatus(bookId);
		if (result == 0) {
			System.out.println("Book Status: Not Available");
		} else {
			System.out.println("Book Status: Available");
		}
	}

}
