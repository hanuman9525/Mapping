package com.hibernate.onotoone.primary;

import org.hibernate.Session;

import com.scp.java.hibernate.utility.DBSessionFactory;

public class OneToOneUniPrimaryKeyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = DBSessionFactory.sf.openSession();
		StdentOneToOne student = new StdentOneToOne("ABC Adale");
		AddressOneToOne address = new AddressOneToOne("Satpute Road, Pimplegurav", "Pune", 411061);

		session.beginTransaction();
		session.persist(student);

		address.setAddressId(student.getRollNum());
		student.setAddressOneToOne(address);

		session.save(student);
		session.getTransaction().commit();

	}

}
