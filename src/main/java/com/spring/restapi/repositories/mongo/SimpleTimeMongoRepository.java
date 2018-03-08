package com.spring.restapi.repositories.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.restapi.models.SimpleTime;
import com.spring.restapi.repositories.SimpleTimeRepository;

/**
 *
 * @author amanganiello90
 */
public interface SimpleTimeMongoRepository extends MongoRepository<SimpleTime, String>, SimpleTimeRepository {

}
