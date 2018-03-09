package com.spring.restapi.models;


/**
*
* @author amanganiello90
*/
public abstract class SimpleTime {

	private String id;

	private String value;

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
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
