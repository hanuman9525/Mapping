package com.hibernate.onetomany.uni.joincolumn;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "StudentOneToManyJoinColumn")
public class StudentOneToMany {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int studRoll;
	private String studName;

	public StudentOneToMany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentOneToMany(String studName) {
		super();
		this.studName = studName;
	}

	public int getStudRoll() {
		return studRoll;
	}

	public void setStudRoll(int studRoll) {
		this.studRoll = studRoll;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}
}
