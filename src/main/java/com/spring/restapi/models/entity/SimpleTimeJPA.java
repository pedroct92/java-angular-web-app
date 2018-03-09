package com.spring.restapi.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.spring.restapi.models.SimpleTime;

/**
 *
 * @author amanganiello90
 */
@Repository
@Profile("h2")
@Entity
@Table(name = "time")
public class SimpleTimeJPA extends SimpleTime implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "value")
	private String value;

	@Override
	public SimpleTime factory() {
		// TODO Auto-generated method stub
		return new SimpleTimeJPA();
	}

}
