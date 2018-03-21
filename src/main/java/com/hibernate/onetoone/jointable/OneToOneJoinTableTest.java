package com.hibernate.onetoone.jointable;

import org.hibernate.Session;

import com.scp.java.hibernate.utility.DBSessionFactory;

public class OneToOneJoinTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = DBSessionFactory.sf.openSession();
		StdentOneToOne student = new StdentOneToOne("Hanuman Adale");
		AddressOneToOne address = new AddressOneToOne("Satpute Road, Pimplegurav", "Pune", 411061);

		session.beginTransaction();
		session.persist(address);

		student.setAddressOneToOne(address);

		session.save(student);
		session.getTransaction().commit();

	}

}
