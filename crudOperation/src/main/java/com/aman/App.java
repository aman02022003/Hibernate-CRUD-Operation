package com.aman;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	SessionFactory factory=HibernateUtil.getSessionFactory();
    	
    	Session session=factory.openSession();
    	
    	Student st=new Student();
    	
    	st.setName("aman");
    	st.setAddress("india");
    	st.setEmail("aman@123@gmail.com");
    	st.setCollageName("iitBomby");
    	
    	
        Student st2=new Student();
    	
    	st2.setName("amit");
    	st2.setAddress("india");
    	st2.setEmail("amit@123@gmail.com");
    	st2.setCollageName("msu");
    	
        Transaction ts=	session.beginTransaction();
    	
    	
    	session.save(st);
    	session.save(st2);
    	
    	ts.commit();
    	
    	System.out.println("data saved");
    	
    	session.clear();
    	factory.close();
    	
    	
    }
}

