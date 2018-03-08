/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.models.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.spring.restapi.models.Product;

/**
 *
 * @author amanganiello90
 */


@Document(collection = "products")
public class ProductMongo extends Product {
	
	@Id
	private String id;
	
	@Override
	public Product factory() {
		return new ProductMongo();
	}

}
