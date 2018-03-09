package com.spring.h2.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.spring.restapi.models.SimpleTime;

/**
 *
 * @author amanganiello90
 */


@Component
@Entity
@Table(name = "Time")
public class SimpleTimeJPA implements SimpleTime, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name = "value")
	private String value;

	@Override
	public SimpleTime factory() {
		// TODO Auto-generated method stub
		return new SimpleTimeJPA();
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}

}
