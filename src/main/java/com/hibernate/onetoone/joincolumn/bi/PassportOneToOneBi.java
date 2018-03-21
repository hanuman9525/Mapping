package com.hibernate.onetoone.joincolumn.bi;

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
@Table(name = "PassportOneToOneJoinColumn_tbl")
public class PassportOneToOneBi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passportId;
	private String passportNumber;
	@OneToOne
	@JoinColumn(name="Person_Id")
	private PersonOneToOneBi person;

	public PassportOneToOneBi(String passportNumber) {
		super();
		this.passportNumber = passportNumber;
	}

	public PassportOneToOneBi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public PersonOneToOneBi getPerson() {
		return person;
	}

	public void setPerson(PersonOneToOneBi person) {
		this.person = person;
	}

}
