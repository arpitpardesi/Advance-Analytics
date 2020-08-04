package com.zensar.day6.jdbc;

public class TestProduct2 {

	public static void main(String[] args) {
		
		ProductDao2 dao = new ProductDao2();
		dao.addProduct1(8, "TUF", 75000);
	}
}
