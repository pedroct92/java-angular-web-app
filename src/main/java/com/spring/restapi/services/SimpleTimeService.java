package com.spring.restapi.services;

import java.util.List;

import javax.transaction.Transactional;

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

	public SimpleTime save(String id) {
		SimpleTime simpleT = simpleTime.factory();
		simpleT.setId(id);
		simpleT.setValue(Long.toString(System.currentTimeMillis()));
		simpleTimeRepository.save(simpleT);
		return simpleT;

	}
}
