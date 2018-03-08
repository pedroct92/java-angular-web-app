/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.models.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.spring.restapi.models.SimpleTime;

/**
 *
 * @author amanganiello90
 */

@Document(collection = "times")
public class SimpleTimeMongo extends SimpleTime {

	@Id
	private long id;

	@Override
	public SimpleTime factory() {
		return new SimpleTimeMongo();
	}
}
