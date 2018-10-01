package com.mohsinkd786.java.ws.soap.api;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.mohsinkd786.java.ws.soap.bean.Product;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ProductService {

	@WebMethod
	Product getProductById(int id);

	@WebMethod
	Product[] getAllProducts();

	@WebMethod
	void addProduct(Product product);
}
