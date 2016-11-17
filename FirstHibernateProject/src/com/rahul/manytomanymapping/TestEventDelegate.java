package com.rahul.manytomanymapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.rahul.inheritance.mapping.Module;
import com.rahul.inheritance.mapping.Project;
import com.rahul.inheritance.mapping.Tasks;

@SuppressWarnings({ "deprecation", "unused" })
public class TestEventDelegate {

	public static void main(String[] args) {
		AnnotationConfiguration config =  new AnnotationConfiguration();
		config.addAnnotatedClass(Delegate.class);
		config.addAnnotatedClass(Event.class);
		config.configure();
		
		// first true denotes that whatever sql statement is generated will be printed in console
		// second true say whatever sql is written needs to executed to database
		new SchemaExport(config).create(true, true);
		
		Delegate delegate1 = new Delegate();
		delegate1.setDelegateName("Rahul Srivastava");
		
		Delegate delegate2 = new Delegate();
		delegate2.setDelegateName("Anand Gupta");
		
		Delegate delegate3 = new Delegate();
		delegate3.setDelegateName("Piyali Das");
		
		Delegate delegate4 = new Delegate();
		delegate4.setDelegateName("Piyush Gupte");
		
		Delegate delegate5 = new Delegate();
		delegate5.setDelegateName("Kiran Mahajan");
		
		Event java101 = new Event();
		java101.setEventName("java 101");
		
		Event cplus101 = new Event();
		cplus101.setEventName("cplus 101");
		
		Event fortan101 = new Event();
		fortan101.setEventName("fortan 101");
		
		java101.getDelegates().add(delegate1);
		java101.getDelegates().add(delegate2);
		java101.getDelegates().add(delegate3);
		
		cplus101.getDelegates().add(delegate4);
		
		fortan101.getDelegates().add(delegate1);
		fortan101.getDelegates().add(delegate5);
		
		SessionFactory  sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		session.save(delegate1);
		session.save(delegate2);
		session.save(delegate3);
		session.save(delegate4);
		session.save(delegate5);
		session.save(java101);
		session.save(cplus101);
		session.save(fortan101);
		
		
		session.getTransaction().commit();
	

	}

}
