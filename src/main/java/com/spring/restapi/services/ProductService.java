package com.spring.restapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.models.Product;
import com.spring.restapi.repositories.ProductRepository;

/**
 *
 * @author amanganiello90
 */
@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	Product product;

	public Product findById(String id) {
		return productRepository.findById(id);
	}

	public String save(Product prod) {
		productRepository.save(prod);
		return prod.getId();
	}

	public List<Product> findAll() {
		return productRepository.findAll();

	}

	public Product update(String id, Product prod) {

		prod.setId(id);

		this.save(prod);
		return prod;
	}

	public String delete(String id) {
		Product prod = this.findById(id);
		productRepository.delete(prod);
		return "product deleted with id: " + id;
	}
}
