package scp.hibernate.mapping.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.scp.java.hibernate.utility.DBSessionFactory;

public class OneToManyAppTest {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		Session session=DBSessionFactory.sf.openSession();
		session.beginTransaction();
		
	
		Set<Phone> phoneNumber=new HashSet<Phone>();
		phoneNumber.add(new Phone("Local","8605878454"));
		phoneNumber.add(new Phone("Local","7719999082"));
		phoneNumber.add(new Phone("Local","8605878454"));
		Student s=new Student("Honey", phoneNumber);
		session.save(s);
		session.getTransaction().commit();
		
	}

}
