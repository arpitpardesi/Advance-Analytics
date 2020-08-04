package com.zensar.day7;

public class Product {

	private int product_id;
	private String product_name;
	private int price;
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		super();
	}
	public Product(int product_id, String product_name, int price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + "]";
	}
	
}
