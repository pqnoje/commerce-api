package com.commerce.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Holder extends Client {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Address billingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    private Phone number;

    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard creditCard;

    public Address getBillingAddress() {
        return this.billingAddress;
    }
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Phone getNumber() {
    	return this.number;
    }
    public void setNumber(Phone number) {
    	this.number = number;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

}