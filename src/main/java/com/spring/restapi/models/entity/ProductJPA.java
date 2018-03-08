package com.spring.restapi.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.spring.restapi.models.Product;

/**
 *
 * @author amanganiello90
 */

@Entity
@Table(name = "product")
public class ProductJPA extends Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column(name = "prodname")
	private String prodName;

	@Column(name = "proddesc")
	private String prodDesc;

	@Column(name = "prodprice")
	private Double prodPrice;

	@Column(name = "prodimage")
	private String prodImage;

	@Override
	public Product factory() {
		// TODO Auto-generated method stub
		return new ProductJPA();
	}

}
