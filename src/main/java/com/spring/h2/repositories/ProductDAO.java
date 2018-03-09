/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.h2.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.spring.restapi.models.Product;
import com.spring.restapi.repositories.ProductRepository;

/**
 *
 * @author amanganiello90
 */

@Repository
public class ProductDAO implements ProductRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Product findById(String id) {
		// TODO Auto-generated method stub
		return entityManager.find(Product.class, id);
	}

	@Override
	public Product save(Product prod) {
		// TODO Auto-generated method stub
		 entityManager.persist(prod);
		 return prod;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Product prod) {
		// TODO Auto-generated method stub
		entityManager.remove(prod);
		
	}

}
