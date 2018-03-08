/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.repositories.dao;


import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.spring.restapi.models.Product;
import com.spring.restapi.repositories.ProductRepository;



/**
 *
 * @author amanganiello90
 */
@Component
@Profile({"h2"})
public interface ProductDAO extends CrudRepository<Product, String>, ProductRepository {


}
