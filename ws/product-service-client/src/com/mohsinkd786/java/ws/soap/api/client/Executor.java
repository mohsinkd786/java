package com.mohsinkd786.java.ws.soap.api.client;

import com.mohsinkd786.java.ws.soap.api.Product;

public class Executor {

	public static void main(String[] args) {
		// use wsimport -keep http://localhost:4500/ws/productService?wsdl
		// generate the source files
		ProductClient client = new ProductClient();
		// fetch all products
		client.fetchAll().forEach(System.out::println);

		// fetch a specific product by id
		System.out.println(client.fetchOne(1).toString());

		// add a new product
		client.addProduct(new Product(5, "Macbook Air", 1500));
	}
}
