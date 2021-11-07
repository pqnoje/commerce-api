package com.commerce.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CivilianDocument {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    private String type;
    private String number;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "taxDocument")
    private Client client;

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public Client getClient() {
        return this.client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

}
