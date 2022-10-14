package business.abstracts;

import java.sql.SQLException;
import java.util.List;

import entities.concretes.Product;

public interface ProductService {
	void add(Product product) throws SQLException;
	List<Product> getAll();
	Product get(int id);
}
