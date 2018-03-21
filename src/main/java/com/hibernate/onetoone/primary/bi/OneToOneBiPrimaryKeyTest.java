package com.hibernate.onetoone.primary.bi;

import org.hibernate.Session;

import com.scp.java.hibernate.utility.DBSessionFactory;

public class OneToOneBiPrimaryKeyTest {
	public static void main(String[] args) {

		Session session=DBSessionFactory.sf.openSession();
		
		PersonOneToOneBi person=new PersonOneToOneBi("Guru11");
		PassportOneToOneBi passport=new PassportOneToOneBi("12388456");
		
		session.beginTransaction();
		
		person.setPassport(passport);
		passport.setPerson(person);
		session.save(person);
		
		session.getTransaction().commit();
	}
}
