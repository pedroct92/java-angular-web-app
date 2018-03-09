/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.restapi.models.mongo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


import com.spring.restapi.models.SimpleTime;

/**
 *
 * @author amanganiello90
 */

@Profile({ "mongo", "mongop" })
@Component
@Document(collection = "times")
public class SimpleTimeMongo extends SimpleTime {

	@Id
	private String id;

	@Override
	public SimpleTime factory() {
		return new SimpleTimeMongo();
	}
}
