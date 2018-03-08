package com.spring.restapi.models;


/**
*
* @author amanganiello90
*/
public abstract class SimpleTime {

	private long id;

	private String value;

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	
	public String getValue() {
		return value;
	}

	
	public void setValue(String value) {
		this.value = value;
	}
	
	public abstract SimpleTime factory();
}
