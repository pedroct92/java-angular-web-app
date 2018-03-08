package com.spring.restapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.restapi.models.Product;
import com.spring.restapi.models.SimpleTime;
import com.spring.restapi.models.entity.ProductJPA;
import com.spring.restapi.models.entity.SimpleTimeJPA;
import com.spring.restapi.repositories.ProductRepository;
import com.spring.restapi.repositories.SimpleTimeRepository;
import com.spring.restapi.repositories.dao.ProductDAO;
import com.spring.restapi.repositories.dao.SimpleTimeDAO;

@Configuration
@Profile("h2")
public class ConfigH2 {

	@Bean
	Product productJPA() {
		Product prod = new ProductJPA();
		return prod;
	}

	@Bean
	SimpleTime simpleTimeJPA() {
		SimpleTime time = new SimpleTimeJPA();
		return time;
	}
	
	/*@Bean
	ProductRepository productDAO() {
		ProductDAO repo=null;
		return repo;
	}
	
	@Bean
	SimpleTimeRepository simpleTimeDAO() {
		SimpleTimeDAO repo = null;
		return repo;
	}*/

}
