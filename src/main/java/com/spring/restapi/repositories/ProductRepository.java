package com.spring.restapi.repositories;

import java.util.List;

import com.spring.restapi.models.Product;

public interface ProductRepository {
	
	public Product findById(String id);
	public Product save(Product prod);
	public List<Product> findAll();
	public void delete(Product prod);

}
