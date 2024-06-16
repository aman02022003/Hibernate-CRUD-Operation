package com.aman;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	
	  private static SessionFactory sf;
	  
	  public static SessionFactory getSessionFactory() {
		  
		  
		  if(sf == null) {
			  
			  Configuration cfg=new Configuration();
			  
			  Properties ps=new Properties();
			  
			ps.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			ps.put(Environment.URL, "jdbc:mysql://localhost:3306/crudoperation");
			ps.put(Environment.USER, "root");
			ps.put(Environment.PASS, "Ankita@123");
			ps.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			ps.put(Environment.HBM2DDL_AUTO, "update");
			ps.put(Environment.SHOW_SQL, true);
			
			cfg.setProperties(ps);
			cfg.addAnnotatedClass(Student.class);
			
			
			ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			
			sf=cfg.buildSessionFactory(sr);
			
		  }
		  
		return sf;
		                 
	  }
}
