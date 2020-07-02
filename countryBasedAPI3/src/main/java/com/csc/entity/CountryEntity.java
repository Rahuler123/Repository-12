package com.csc.entity;

import java.io.Serializable;

public class CountryEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer country_id;
    private String countries;
    
    public CountryEntity() {
    
    }

	public CountryEntity(Integer country_id, String countries) {
		this.country_id = country_id;
		this.countries = countries;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}



}
