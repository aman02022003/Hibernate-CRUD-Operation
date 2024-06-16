package com.aman;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Fetch {
    
	   public static void main(String[] args) {
		   
		   SessionFactory factory=HibernateUtil.getSessionFactory();
		    
		    Session session=factory.openSession();
		    
		    Transaction ts=session.beginTransaction();
		    
		     List<Student> list=session.createQuery("from Student",Student.class).list();
		     
		     list.forEach(e -> System.out.println(e));
		    
		    session.clear();
		    factory.close();
		   
	   }
	    
	    
	    
	
}
