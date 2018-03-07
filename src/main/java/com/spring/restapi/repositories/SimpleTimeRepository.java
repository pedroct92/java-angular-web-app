package com.spring.restapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.restapi.models.SimpleTime;

public interface SimpleTimeRepository extends MongoRepository<SimpleTime, String> {

}
