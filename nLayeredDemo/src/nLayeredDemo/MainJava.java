package nLayeredDemo;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.business.conretes.ProductManager;
import nLayerDemo.dataAccess.concretes.HibernateProductDao;
import nLayerDemo.entities.concretes.Product;

public class MainJava {

	//ToDo Spring IoC ile çözülecek
	public static void main(String[] args) {
		ProductService productService = new ProductManager(new HibernateProductDao());
		
		Product product = new Product(1,2, "Elma", 12, 50);
		productService.add(product);

	}

}
