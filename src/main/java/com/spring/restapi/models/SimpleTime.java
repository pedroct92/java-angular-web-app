package com.spring.restapi.models;

/**
 *
 * @author amanganiello90
 */
public interface SimpleTime {

	public String getId();

	public void setId(String id);

	public String getValue();

	public void setValue(String value);

	public SimpleTime factory();
}
