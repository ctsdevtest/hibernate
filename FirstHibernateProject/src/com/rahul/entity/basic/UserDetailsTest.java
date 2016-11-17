package com.rahul.entity.basic;

import java.sql.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

@SuppressWarnings({ "deprecation", "unused" })
public class UserDetailsTest {

	public static void main(String[] args) {
 		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(UserDetails.class);
		config.configure();// to read configuration file

		// To create the table
		new SchemaExport(config).create(true, true);
		

		UserDetails rahul =  new UserDetails();
		rahul.setUserId(10);
		rahul.setUserName("Rahul");
		rahul.setUserPassword("yahoo@123");
		rahul.setUserJoiningDate(new GregorianCalendar(2013,12,25));
		rahul.setUserLoginTime(Date.valueOf("2013-10-23"));
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		session.save(rahul);
		session.getTransaction().commit();
	}

}
