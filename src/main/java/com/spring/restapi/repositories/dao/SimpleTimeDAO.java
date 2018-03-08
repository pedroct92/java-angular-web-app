package com.spring.restapi.repositories.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.spring.restapi.models.SimpleTime;
import com.spring.restapi.repositories.SimpleTimeRepository;

/**
 *
 * @author amanganiello90
 */
@Component
@Profile({"h2"})
public interface SimpleTimeDAO extends CrudRepository<SimpleTime, String>, SimpleTimeRepository {

	

}
