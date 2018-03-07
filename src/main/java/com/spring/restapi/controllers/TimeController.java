package com.spring.restapi.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.models.SimpleTimeMongo;
import com.spring.restapi.repositories.SimpleTimeRepository;

/**
 *
 * @author amanganiello90
 */
@RestController
public class TimeController {

	@Autowired
	SimpleTimeRepository simpleTimeRepository;

	@RequestMapping(path = "/times", method = RequestMethod.GET)
	public Iterable<SimpleTimeMongo> findByRepo() throws IOException {
		return simpleTimeRepository.findAll();
	}

	@RequestMapping(value = "/times/{value}", method = RequestMethod.GET)
	public SimpleTimeMongo saveByRepo(@PathVariable String value) {
		SimpleTimeMongo model = new SimpleTimeMongo();
		model.setId(System.currentTimeMillis());
		model.setValue(value);
		simpleTimeRepository.save(model);
		return model;
	}

}
