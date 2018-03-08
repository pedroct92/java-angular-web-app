package com.spring.restapi.repositories;

import java.util.List;

import com.spring.restapi.models.SimpleTime;

public interface SimpleTimeRepository {

	public SimpleTime findById(String id);

	public SimpleTime save(SimpleTime time);

	public List<SimpleTime> findAll();
}
