package com.spring.restapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.models.SimpleTime;
import com.spring.restapi.repositories.SimpleTimeRepository;

/**
 *
 * @author amanganiello90
 */
@Service
public class SimpleTimeService {

	@Autowired
	SimpleTimeRepository simpleTimeRepository;

	@Autowired
	SimpleTime simpleTime;

	public List<SimpleTime> findAll() {
		return simpleTimeRepository.findAll();
	}

	public SimpleTime findById(String id) {
		return simpleTimeRepository.findById(id);
	}

	public SimpleTime save(String value) {
		SimpleTime simpleT = simpleTime.factory();
		simpleT.setId(System.currentTimeMillis());
		simpleT.setValue(value);
		simpleTimeRepository.save(simpleT);
		return simpleT;

	}
}
