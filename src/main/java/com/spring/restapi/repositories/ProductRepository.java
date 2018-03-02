/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.repositories;

import com.spring.restapi.models.Product;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author didin
 */
public interface ProductRepository extends MongoRepository<Product, String> {
    
	Optional<Product> findById(String id);
    void delete(Product deleted);
}
