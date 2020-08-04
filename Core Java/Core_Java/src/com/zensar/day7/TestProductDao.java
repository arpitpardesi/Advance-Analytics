package com.zensar.day7;

import java.util.List;

public class TestProductDao {

	public static void main(String[] args) {
		ProductDao productDao = new ProductDaoImpl();

	    testAddProduct(new Product(1,"Legion",70000) , productDao);
		// testDelProduct(4, productdao);
		// testGetProduct(2, productdao);
		// testGetAllProduct(productDao);
		//testUpdateProduct(new Product(5, "Asus ROG", 60000), productDao);
	}

	public static void testAddProduct(Product product, ProductDao productDao) {

		int result = productDao.addProduct(product);
		if (result == 0) {
			System.out.println("Addition Failed");
		} else {
			System.out.println("Addition Successful");
		}
	}

	public static void testDelProduct(int productid, ProductDao productDao) {
		int result = productDao.deleteProduct(productid);
		if (result == 0) {
			System.out.println("Deletion Failed");
		} else {
			System.out.println("Deletion Successful");
		}
	}

	public static void testGetProduct(int productId, ProductDao productDao) {
		Product product = productDao.getProduct(productId);
		System.out.println(product);
	}

	public static void testGetAllProduct(ProductDao productDao) {
		List<Product> allProduct = productDao.getAllProduct();
		System.out.println(allProduct);
	}

	public static void testUpdateProduct(Product product, ProductDao productDao) {
		int result = productDao.updateProduct(product);
		if (result == 0) {
			System.out.println("Updation Failed");
		} else {
			System.out.println("Updation Successful");
		}
	}

}
