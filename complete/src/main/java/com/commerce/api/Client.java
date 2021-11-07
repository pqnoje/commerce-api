package com.commerce.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String fullname;

	@OneToOne(cascade = CascadeType.ALL)
	private Phone phone;

	@OneToOne(cascade = CascadeType.ALL)
	private Address shippingAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private FundingInstrument fundingInstrument;

	@OneToOne(cascade = CascadeType.ALL)
	private CivilianDocument taxDocument;

	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public Phone getPhone() {
		return this.phone;
	}

	public Address getShippingAddress() {
		return this.shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public FundingInstrument getFundingInstrument() {
		return this.fundingInstrument;
	}
	public void setFundingInstrument(FundingInstrument fundingInstrument) {
		this.fundingInstrument = fundingInstrument;
	}
		
	public CivilianDocument getTaxDocument() {
		return this.taxDocument;
	}
	public void setTaxDocument(CivilianDocument taxDocument) {
		this.taxDocument = taxDocument;
	}

}
