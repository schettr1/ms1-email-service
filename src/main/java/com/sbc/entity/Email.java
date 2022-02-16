package com.sbc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email")
public class Email {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String efrom;
	private String eto;
	private String emessage;
	
	public Email() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEfrom() {
		return efrom;
	}

	public void setEfrom(String efrom) {
		this.efrom = efrom;
	}

	public String getEto() {
		return eto;
	}

	public void setEto(String eto) {
		this.eto = eto;
	}

	public String getEmessage() {
		return emessage;
	}

	public void setEmessage(String emessage) {
		this.emessage = emessage;
	}
	
	
}
