package com.hibernate.onetoone.jointable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "StudOneToOneJoinTable_tbl")
public class StdentOneToOne {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rollNum;
	private String fullName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="stud_address_tbl",joinColumns=@JoinColumn(name="rollNum"),inverseJoinColumns=@JoinColumn(name="address_id"))
	private AddressOneToOne addressOneToOne;

	public StdentOneToOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StdentOneToOne(String fullName) {
		super();
		this.fullName = fullName;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public AddressOneToOne getAddressOneToOne() {
		return addressOneToOne;
	}

	public void setAddressOneToOne(AddressOneToOne addressOneToOne) {
		this.addressOneToOne = addressOneToOne;
	}
}
