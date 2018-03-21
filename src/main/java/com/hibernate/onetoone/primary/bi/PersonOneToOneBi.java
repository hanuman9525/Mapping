package com.hibernate.onetoone.primary.bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PersonOneToOne_tbl")
public class PersonOneToOneBi {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int persionId;
	private String personName;
	@OneToOne(mappedBy="person", cascade=CascadeType.ALL)
	private PassportOneToOneBi passport;
	
	
	public PersonOneToOneBi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PersonOneToOneBi(String personName) {
		super();
		this.personName = personName;
		this.passport = passport;
	}

	public int getPersionId() {
		return persionId;
	}

	public void setPersionId(int persionId) {
		this.persionId = persionId;
	}

	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public PassportOneToOneBi getPassport() {
		return passport;
	}
	public void setPassport(PassportOneToOneBi passport) {
		this.passport = passport;
	}

}
