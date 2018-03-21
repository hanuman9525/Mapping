package scp.hibernate.mapping.onetomany;

import java.util.Set;

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

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "stud_mapping_tbl")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stud_id")
	private int id;
	@Column(name="stud_name", nullable=false, length=25)
	private String name;
	@OneToMany()
	@JoinColumn(name="Student_ID")
	//@JoinTable(name="stud_phone", joinColumns={@JoinColumn(name="id",referencedColumnName="stud_id")},inverseJoinColumns={@JoinColumn(name="phoneId",referencedColumnName="phone_id")})
	private Set<Phone> studentPhoneNo;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Set<Phone> studentPhoneNo) {
		super();
		this.name = name;
		this.studentPhoneNo = studentPhoneNo;
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

	public Set<Phone> getStudentPhoneNo() {
		return studentPhoneNo;
	}

	public void setStudentPhoneNo(Set<Phone> studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}

}
