package com.hibernate.onetomany.uni.jointable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.scp.java.hibernate.utility.DBSessionFactory;

public class OneToManyUniTest {
	public static void main(String[] args) {
		Session session = DBSessionFactory.sf.openSession();
		
		UniversityOneToMany university = new UniversityOneToMany("University Of Pune", "India");
		StudentOneToMany student = new StudentOneToMany("Hanuman");
		StudentOneToMany student1 = new StudentOneToMany("Pradip");

		session.beginTransaction();
		
		List<StudentOneToMany> list = new ArrayList<StudentOneToMany>();
		list.add(student);
		list.add(student1);
		university.setStudent(list);
		session.save(university);
		session.getTransaction().commit();
	}
}
