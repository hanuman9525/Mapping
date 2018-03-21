package com.hibernate.onetomany.uni.joincolumn;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UniversityOneToManyJoinColumn_tbl")
public class UniversityOneToMany {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	private String name;
	private String country;

	@OneToMany(targetEntity=StudentOneToMany.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="id")
	private List<StudentOneToMany> student;

	public UniversityOneToMany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UniversityOneToMany(String name, String country) {
		super();
		this.name = name;
		this.country = country;
		student=new ArrayList<StudentOneToMany>();
	}


	public List<StudentOneToMany> getStudent() {
		return student;
	}

	public void setStudent(List<StudentOneToMany> student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
