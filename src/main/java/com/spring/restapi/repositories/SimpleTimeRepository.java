package com.spring.restapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.restapi.models.SimpleTimeMongo;

public interface SimpleTimeRepository extends MongoRepository<SimpleTimeMongo, String> {

}
