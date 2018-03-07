/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.repositories;

import com.spring.restapi.models.ProductMongo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author amanganiello90
 */
public interface ProductRepository extends MongoRepository<ProductMongo, String> {

	Optional<ProductMongo> findById(String id);

}
