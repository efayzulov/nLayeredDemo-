package nLayerDemo.business.conretes;

import java.util.List;

import nLayerDemo.Core.LoggerService;
import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.dataAccess.abstracts.ProductDao;
import nLayerDemo.entities.concretes.Product;

public class ProductManager implements ProductService  {
	
	private ProductDao ProductDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
	    this.ProductDao = productDao;
	    this.loggerService = loggerService;
	}


	@Override
	public void add(Product product) {
		if (product.getCategoryId() ==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.ProductDao.add(product); 
		this.loggerService.logToSystem("Ürün eklendi : " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
