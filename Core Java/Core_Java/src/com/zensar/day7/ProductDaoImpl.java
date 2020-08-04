package com.zensar.day7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub

		Connection con = DbUtil.getMySqlDbConnection();

		String sql = "insert into product values (?,?,?)";
		int result = 0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(1, product.getProduct_id());
			pst.setString(2, product.getProduct_name());
			pst.setInt(3, product.getPrice());

			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteProduct(int productID) {
		// TODO Auto-generated method stub
		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "delete from product where product_id = ?";
		int result = 0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productID);
			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = null;
		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "select * from product where product_id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productId);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String productName = rs.getString("product_name");
				int price = rs.getInt("price");
				product = new Product(productId, productName, price);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return product;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub

		List<Product> allProduct = new ArrayList<Product>();
		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "select * from product";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int productId = rs.getInt("product_id");
				String productName = rs.getString("product_name");
				int price = rs.getInt("price");
				Product product = new Product(productId, productName, price);
				allProduct.add(product);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return allProduct;
	}

	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		
		Connection con = DbUtil.getMySqlDbConnection();

		String sql = "update product set product_name = ? where product_id = ?";
		int result = 0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(2, product.getProduct_id());
			pst.setString(1, product.getProduct_name());

			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

}
