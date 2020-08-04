package com.zensar.library_management;

import java.util.List;

public interface LibraryDao {

	public int addBook(Library library);
	public int deleteBook(int bookId);
	public int bookStatus(int bookId);
	public Library getBook(int bookId);
	public List<Library> getAllBooks();
	public int updateBook(Library library);
	
}
