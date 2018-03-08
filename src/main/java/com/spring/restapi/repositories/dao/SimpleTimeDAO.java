package com.spring.restapi.repositories.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.restapi.models.SimpleTime;
import com.spring.restapi.repositories.SimpleTimeRepository;

/**
 *
 * @author amanganiello90
 */

public interface SimpleTimeDAO extends CrudRepository<SimpleTime, String>, SimpleTimeRepository {

	

}
