/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.repositories.mongo;


import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.restapi.models.Product;
import com.spring.restapi.repositories.ProductRepository;



/**
 *
 * @author amanganiello90
 */
@Profile({ "mongo", "mongop" })
public interface ProductMongoRepository extends MongoRepository<Product, String>, ProductRepository {


}
