/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.controllers;

import com.spring.restapi.models.ProductMongo;
import com.spring.restapi.repositories.ProductRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author didin
 */
@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;
    
    @RequestMapping(method=RequestMethod.GET, value="/products")
    public Iterable<ProductMongo> product() {
        return productRepository.findAll();
    } 
    
    @RequestMapping(method=RequestMethod.POST, value="/products")
    public String save(@RequestBody ProductMongo product) {
        productRepository.save(product);

        return product.getId();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/products/{id}")
    public Optional<ProductMongo> show(@PathVariable String id) {
        return productRepository.findById(id);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/products/{id}")
    public ProductMongo update(@PathVariable String id, @RequestBody ProductMongo product) {
        Optional<ProductMongo> prodOptional = productRepository.findById(id);
        ProductMongo prod= prodOptional.get();
        if(product.getProdName() != null)
            prod.setProdName(product.getProdName());
        if(product.getProdDesc() != null)
            prod.setProdDesc(product.getProdDesc());
        if(product.getProdPrice() != null)
            prod.setProdPrice(product.getProdPrice());
        if(product.getProdImage() != null)
            prod.setProdImage(product.getProdImage());
        productRepository.save(prod);
        return prod;
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
    public String delete(@PathVariable String id) {
        Optional<ProductMongo> prodOptional = productRepository.findById(id);
        ProductMongo product= prodOptional.get();
        productRepository.delete(product);

        return "product deleted";
    }
}