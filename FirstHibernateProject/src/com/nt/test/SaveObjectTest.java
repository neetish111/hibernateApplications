package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.Employee17;

public class SaveObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Employee17 emp=null;
		Transaction tx=null;
		cfg=new Configuration();
		cfg=cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
		ses=factory.openSession();
		emp=new Employee17();
		emp.setEid(1071);
		emp.setFirstname("Neetish");
		emp.setLastname("Maurya");
		emp.setEmail("neetishmaurya111");
		try {
			tx=ses.beginTransaction();
			ses.save(emp);
			tx.commit();
			System.out.println("object is saved/record is inserted");
		}
		catch(Exception e)
		{
			tx.rollback();
		}
		ses.close();
		factory.close();
		
		
		

	}

}
