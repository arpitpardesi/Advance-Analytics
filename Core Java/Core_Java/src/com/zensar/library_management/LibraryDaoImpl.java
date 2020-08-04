package com.zensar.library_management;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zensar.day7.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LibraryDaoImpl implements LibraryDao {

	@Override
	public int addBook(Library library) {
		// TODO Auto-generated method stub
		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "insert into library values (?,?,?,?,?)";
		int result = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, library.getBookId());
			pst.setString(2, library.getBookName());
			pst.setString(3, library.getBookAuthor());
			pst.setInt(4, library.getBookPrice());
			pst.setString(5, library.getBookStatus());
			
			result = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int deleteBook(int bookId) {
		// TODO Auto-generated method stub

		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "delete from library where book_id = ?";
		int result = 0;
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, bookId);
			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int bookStatus(int bookId) {
		// TODO Auto-generated method stub

		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "select book_status from library where book_id = ?";
		int result = 0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, bookId);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String bookStat = rs.getString("book_status");
				if(bookStat.equals("Available")) {
					result = 1;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Library getBook(int bookId) {
		// TODO Auto-generated method stub
		Library library = null;
		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "select * from library where book_id = ?";
		
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, bookId);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String bookName= rs.getString("book_name");
				String bookAuth= rs.getString("book_author");
				int bookPrice= rs.getInt("book_price");
				String bookStat= rs.getString("book_status");
				
				library = new Library(bookId,bookName,bookAuth,bookPrice,bookStat);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return library;
	}

	@Override
	public List<Library> getAllBooks() {
		// TODO Auto-generated method stub

		List<Library> allBook = new ArrayList<Library>();
		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "select * from library";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String bookName= rs.getString("book_name");
				String bookAuth= rs.getString("book_author");
				int bookPrice= rs.getInt("book_price");
				String bookStat= rs.getString("book_status");
				
				Library library = new Library(bookId,bookName,bookAuth,bookPrice,bookStat);
				allBook.add(library);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return allBook;
	}

	@Override
	public int updateBook(Library library) {
		// TODO Auto-generated method stub

		Connection con = DbUtil.getMySqlDbConnection();

		String sql = "update library set book_status = ? where book_id = ?";
		int result = 0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(2, library.getBookId());
			pst.setString(1, library.getBookStatus());

			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
