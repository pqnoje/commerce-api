package com.commerce.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FundingInstrument {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    private String method;

    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard creditCard;

    public String getMethod() {
        return this.method;
    }
    public void setMethod(String method) {
        this.method = method;
    }

    public CreditCard getCreditCard() {
    	return this.creditCard;
    }
    public void setCreditCard(CreditCard creditCard) {
    	this.creditCard = creditCard;
    }
;
}