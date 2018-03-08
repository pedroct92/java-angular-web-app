package com.spring.restapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.restapi.models.Product;
import com.spring.restapi.models.SimpleTime;
import com.spring.restapi.models.mongo.ProductMongo;
import com.spring.restapi.models.mongo.SimpleTimeMongo;
import com.spring.restapi.repositories.ProductRepository;
import com.spring.restapi.repositories.SimpleTimeRepository;
import com.spring.restapi.repositories.mongo.ProductMongoRepository;
import com.spring.restapi.repositories.mongo.SimpleTimeMongoRepository;

@Configuration
@Profile({ "mongo", "mongop" })
public class ConfigMongo {

	@Bean
	Product productMongo() {
		Product prod = new ProductMongo();
		return prod;
	}

	@Bean
	SimpleTime simpleTimeMongo() {
		SimpleTime time = new SimpleTimeMongo();
		return time;
	}

	/*@Bean
	ProductRepository productMongoRepository() {
		ProductMongoRepository repo = null;
		return repo;
	}

	@Bean
	SimpleTimeRepository simpleTimeMongoRepository() {
		SimpleTimeMongoRepository repo = null;
		return repo;
	}*/
}
