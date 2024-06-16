package com.aman;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Delete {

	
	public static void main(String[] args) {
		   
		   SessionFactory factory=HibernateUtil.getSessionFactory();
		    
		    Session session=factory.openSession();
		    
		    Transaction ts=session.beginTransaction();
		    
		    Student st= session.get(Student.class, 2);
		    st.setName("mauriya");
		    st.setEmail("mauriya123@gmail.com");
		    
		    session.delete(st);
		    
		    ts.commit();
		    System.out.println("deleted");
		    
		    session.clear();
		    factory.close();
		   
	   }
	
}
