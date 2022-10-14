package dataAccess.concretes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class HProductDao implements ProductDao {
	
	String jdbcURL = "jdbc:postgresql://localhost:5432/db";
	String username= "postgres";
	String password = "123asdf";
	
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, username, password);
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO \"Product\" (product_name,category, price) VALUES (?, ?, ?)");
            stmt.setString(1, product.getProductName());
            stmt.setString(2, product.getCategory());
            stmt.setInt(3, product.getPrice());
            stmt.executeUpdate();

			System.out.println("New product has been added");
        	
    } 
	catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stu b
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		Product product = null;
		
		try (
				Connection conn = DriverManager.getConnection(jdbcURL, username, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT product_id, product_name, category, price FROM \"Product\" where product_id = " + id)) {
			while (rs.next()) {
				product =  new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getString("category"), rs.getInt("price"));
	        }
            	
        } 
		catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return product;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

		
	}
