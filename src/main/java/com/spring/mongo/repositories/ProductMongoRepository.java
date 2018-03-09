/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.mongo.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.restapi.models.Product;
import com.spring.restapi.repositories.ProductRepository;



/**
 *
 * @author amanganiello90
 */
public interface ProductMongoRepository extends MongoRepository<Product, String>, ProductRepository {


}
