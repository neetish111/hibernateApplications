package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.Product;
import com.nt.utility.HibernateUtil;

public class LoadObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=null;
		Product pd=null;
		ses=HibernateUtil.getSession();
		try {
			pd=ses.get(Product.class, 1002);
			if(pd==null)
			{
				System.out.println("record not found!!!");
			}
			else {
				System.out.println(pd);
			}
		}
		catch(HibernateException hb) {
			hb.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}

	}

}
