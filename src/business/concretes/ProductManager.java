package business.concretes;
import java.util.List;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product){
		//some if else constraints here
		this.productDao.add(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return this.productDao.get(id);
		
	}

}
