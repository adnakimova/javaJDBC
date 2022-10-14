package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.concretes.HProductDao;
import entities.concretes.Product;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		  ProductService productService = new ProductManager(new HProductDao());
//		  Product product = new Product("Juice", "Beverage", 34);
//		  prodServ.add(product);
		  Product product = productService.get(3);
		  System.out.println(product.getId() +" " + product.getProductName() +" " + product.getCategory() +" " + product.getPrice());
		
		
	}

}
