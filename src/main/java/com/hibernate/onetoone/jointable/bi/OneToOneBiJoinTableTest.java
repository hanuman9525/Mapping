package com.hibernate.onetoone.jointable.bi;

import org.hibernate.Session;

import com.scp.java.hibernate.utility.DBSessionFactory;

public class OneToOneBiJoinTableTest {
	public static void main(String[] args) {

		Session session=DBSessionFactory.sf.openSession();
		
		PersonOneToOneBi person=new PersonOneToOneBi("Hanu");
		PassportOneToOneBi passport=new PassportOneToOneBi("45678");
		
		session.beginTransaction();
		
		person.setPassport(passport);
		passport.setPerson(person);
		session.save(person);
		
		session.getTransaction().commit();
	}
}
