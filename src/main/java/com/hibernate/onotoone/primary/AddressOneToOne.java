package com.hibernate.onotoone.primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AddressOneToOne_tbl")
public class AddressOneToOne {
	@Id
	@Column(name = "address_id")
	private int addressId;
	private String street;
	private String city;
	private int pin;

	public AddressOneToOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressOneToOne(String street, String city, int pin) {
		super();
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}
