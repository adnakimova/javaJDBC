package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Product;

public interface ProductDao {
	public void add(Product product);
	public void update(Product product);
	public void delete (Product product);
	public Product get(int id);
	public List<Product> getAll();
}
