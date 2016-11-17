package com.rahul.onetoone;

import one.clas.two.tables.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

@SuppressWarnings({ "deprecation", "unused" })
public class TestPerson {

	public static void main(String[] args) {

		AnnotationConfiguration config =  new AnnotationConfiguration();
		config.addAnnotatedClass(Person.class);
		config.addAnnotatedClass(PersonDetails.class);
		config.configure();
		
		// first true denotes that whatever sql statement is generated will be printed in console
		// second true say whatever sql is written needs to executed to database
		new SchemaExport(config).create(true, true);
		
		SessionFactory  sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Person rahul = new Person();
		rahul.setPersonName("Rahul");
		
		PersonDetails personDetails = new PersonDetails();
		personDetails.setIncome(10000);
		personDetails.setJob("Engineer");
		personDetails.setZipCode("826001");
		
		rahul.setPersonDetails(personDetails);
		
		session.save(rahul);
		
		// No need if we set the cascade type 
		//session.save(personDetails);
		session.getTransaction().commit();
	}

}
