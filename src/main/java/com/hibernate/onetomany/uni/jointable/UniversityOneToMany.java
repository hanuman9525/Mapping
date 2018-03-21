package com.hibernate.onetomany.uni.jointable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UniversityOneToManyJoinTable_tbl")
public class UniversityOneToMany {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	private String name;
	private String country;

	@OneToMany(cascade=CascadeType.ALL,targetEntity=StudentOneToMany.class)
	@JoinTable(name="University_student_JoinTable_uni",joinColumns=@JoinColumn(name="id"),inverseJoinColumns=@JoinColumn(name="s_id"))
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
