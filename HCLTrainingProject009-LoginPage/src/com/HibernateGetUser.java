package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateGetUser {

	
	public static void getUser(User user) {
		try {
			Configuration configuration = new Configuration().configure();
			configuration.addAnnotatedClass(com.User.class);
			StandardServiceRegistryBuilder builder = 
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			SessionFactory factory = configuration.buildSessionFactory(builder.build());
			
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.refresh(user);
			transaction.commit();
			session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
