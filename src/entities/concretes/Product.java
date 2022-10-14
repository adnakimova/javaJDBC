package entities.concretes;

import entities.abstracts.Entity;

public class Product implements Entity{
	
	private int id;
	private String productName;
	private String category;
	private int price;
	
	
	public Product(int id, String productName, String category, int price) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {  
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}