package com.zensar.library_management;

import java.util.List;

public class TestLibraryDao {

	public static void main(String[] args) {
		LibraryDao libraryDao = new LibraryDaoImpl(); 

	    //testAddBook(new Library(3, "GHI", "GHI", 100 ,"Not Available") , libraryDao);
		//testDelBook(3, libraryDao);
		//testGetBook(2, libraryDao);
		//testGetAllBook(libraryDao);
		//testUpdateBook(new Library(2, "DEF", "DEF", 100 ,"Not Available"), libraryDao);
		//testGetBookStatus(2, libraryDao);
	}

	public static void testAddBook(Library library, LibraryDao libraryDao) {

		int result = libraryDao.addBook(library);
		if (result == 0) {
			System.out.println("Addition Failed");
		} else {
			System.out.println("Addition Successful");
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

	public static void testGetBook(int bookId, LibraryDao libraryDao) {
		Library library = libraryDao.getBook(bookId);
		System.out.println(library);
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
