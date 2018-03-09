package com.spring.restapi.models;

/**
 *
 * @author amanganiello90
 */
public interface Product {

	public String getId();

	public void setId(String id);

	public String getProdName();

	public void setProdName(String prodName);

	public String getProdDesc();

	public void setProdDesc(String prodDesc);

	public Double getProdPrice();

	public void setProdPrice(Double prodPrice);

	public String getProdImage();

	public void setProdImage(String prodImage);

	public abstract Product factory();

}
