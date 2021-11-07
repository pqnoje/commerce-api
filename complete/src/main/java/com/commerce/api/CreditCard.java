package com.commerce.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CreditCard {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    private String expirationDate;
    private String expirationYear;
    private String number;

    @OneToOne(cascade = CascadeType.ALL)
    private Holder holder;

    public String getExpirationDate() {
        return this.expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationYear() {
    	return this.expirationYear;
    }
    public void setExpirationYear(String expirationYear) {
    	this.expirationYear = expirationYear;
    }


    public String getNumber() {
    	return this.number;
    }
    public void setNumber(String number) {
    	this.number = number;
    }


    public Holder getHolder() {
    	return this.holder;
    }
    public void setHolder(Holder holder) {
    	this.holder = holder;
    }
    
}
