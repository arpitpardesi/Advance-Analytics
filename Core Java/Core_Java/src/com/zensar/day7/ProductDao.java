package com.zensar.day7;

import java.util.List;

public interface ProductDao {
	
	public int addProduct(Product product);
	
    public int deleteProduct(int productID);
    
    public Product getProduct(int productID);

    public List<Product> getAllProduct();
    
    public int updateProduct(Product product);
}
