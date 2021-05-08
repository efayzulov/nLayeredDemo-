package nLayerDemo.business.conretes;

import java.util.List;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.dataAccess.abstracts.ProductDao;
import nLayerDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	public ProductManager(ProductDao productDao) {
		super();
		ProductDao = productDao;
	}

	private ProductDao ProductDao;

	@Override
	public void add(Product product) {
		if (product.getCategoryId() ==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.ProductDao.add(product);  
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
