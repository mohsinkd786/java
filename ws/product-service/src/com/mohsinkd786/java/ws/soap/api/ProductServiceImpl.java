package com.mohsinkd786.java.ws.soap.api;

import java.util.stream.Stream;

import javax.jws.WebService;

import com.mohsinkd786.java.ws.soap.bean.Product;

@WebService
public class ProductServiceImpl implements ProductService {

	private static Product[] products = new Product[10];
	static {
		products[0] = new Product(1, "iPhone", 200);
		products[1] = new Product(2, "Nexus", 350);
		products[2] = new Product(3, "Lumia", 100);
	};

	@Override
	public Product getProductById(int id) {
		return Stream.of(products).filter(p -> p.getId() == id).findFirst().get();
	}

	@Override
	public Product[] getAllProducts() {
		return products;
	}

	@Override
	public void addProduct(Product product) {
		products[3] = product;
	}
}
