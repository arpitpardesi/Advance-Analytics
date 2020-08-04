package com.zensar.day6.jdbc;

public class TestProduct {

	public static void main(String[] args) {
		
		ProductDao dao = new ProductDao();
		//dao.addProduct(7, "Predator", 65000);
		//dao.deleteProduct(4);
		dao.getProduct(1);
		
	}
}
