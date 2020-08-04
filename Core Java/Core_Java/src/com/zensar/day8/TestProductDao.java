package com.zensar.day8;

import java.util.List;

import org.junit.Test;

import com.zensar.day7.Product;
import com.zensar.day7.ProductDao;
import com.zensar.day7.ProductDaoImpl;

import junit.framework.Assert;

public class TestProductDao {
	ProductDao productDao = new ProductDaoImpl();
	Product product = new Product();

	/*
	public static void main(String[] args) {
		ProductDao productDao = new ProductDaoImpl();

	    //testAddProduct(new Product(4,"Alienware",160000) , productDao);
		// testDelProduct(4, productdao);
		// testGetProduct(2, productdao);
		// testGetAllProduct(productDao);
		testUpdateProduct(new Product(5, "Asus ROG", 60000), productDao);
	}
*/
	@Test
	public void testAddProduct() {

		int result = productDao.addProduct(new Product(9, "MSI", 70000));
		Assert.assertEquals(1, result);
		if (result == 0) {
			System.out.println("Addition Failed");
		} else {
			System.out.println("Addition Successful");
		}
	}

	@Test
	public void testDelProduct() {
		int result = productDao.deleteProduct(12);
		Assert.assertEquals(1, result);
		
		if (result == 0) {
			System.out.println("Deletion Failed");
		} else {
			System.out.println("Deletion Successful");
		}
	}

	@Test
	public void testGetProduct() {
		Product product = productDao.getProduct(4);
		System.out.println(product);
		Assert.assertNotNull(product);
	}
	
	@Test
	public void testGetAllProduct() {
		List<Product> allProduct = productDao.getAllProduct();
		System.out.println(allProduct);
		Assert.assertNotNull(allProduct);
	}

	@Test
	public void testUpdateProduct() {
		int result = productDao.updateProduct(new Product(5, "Asus ROG", 60000));
		Assert.assertEquals(1, result);
		if (result == 0) {
			System.out.println("Updation Failed");
		} else {
			System.out.println("Updation Successful");
		}
	}

}
