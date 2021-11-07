package com.commerce.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Address {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Client client;

    private String city;
    private String district;
    private String street;
    private String streetNumber;
    private String zipCode;
    private String state;
    private String country;

    public Client getClient() {
        return this.client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
    	return this.district;
    }
    public void setDistrict(String district) {
    	this.district = district;
    }

    public String getStreet() {
    	return this.street;
    }
    public void setStreet(String street) {
    	this.street = street;
    }

    public String getStreetNumber() {
    	return this.streetNumber;
    }
    public void setStreetNumber(String streetNumber) {
    	this.streetNumber = streetNumber;
    }

    public String getZipCode() {
    	return this.zipCode;
    }
    public void setZipCode(String zipCode) {
    	this.zipCode = zipCode;
    }

    public String getState() {
    	return this.state;
    }
    public void setState(String state) {
    	this.state = state;
    }

    public String getCountry() {
    	return this.country;
    }
    public void setCountry(String country) {
    	this.country = country;
    }
}