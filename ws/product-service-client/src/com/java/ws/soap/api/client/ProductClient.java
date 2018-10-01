package com.java.ws.soap.api.client;

import java.util.List;

import com.mohsinkd786.java.ws.soap.api.Product;
import com.mohsinkd786.java.ws.soap.api.ProductServiceImpl;
import com.mohsinkd786.java.ws.soap.api.ProductServiceImplService;

public class ProductClient {

	private ProductServiceImplService portType = new ProductServiceImplService();
	private ProductServiceImpl service = portType.getProductServiceImplPort();

	public List<Product> fetchAll() {
		return service.getAllProducts();
	}

	public Product fetchOne(int id) {
		return service.getProductById(id);
	}

	public void addProduct(Product product) {
		service.addProduct(product);
	}
}
