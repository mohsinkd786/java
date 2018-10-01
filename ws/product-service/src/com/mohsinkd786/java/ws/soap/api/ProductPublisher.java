package com.mohsinkd786.java.ws.soap.api;

import javax.xml.ws.Endpoint;

public class ProductPublisher {

	public static void main(String[] args) {
		// expose product service
		Endpoint.publish("http://localhost:4500/ws/productService", new ProductServiceImpl());
	}
}
