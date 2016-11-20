package com.rahul.inheritance.mapping;

import one.clas.two.tables.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

@SuppressWarnings({ "deprecation", "unused" })
public class TestMultiLevelInheritance {

	public static void main(String[] args) {
		AnnotationConfiguration config =  new AnnotationConfiguration();
		config.addAnnotatedClass(Project.class);
		config.addAnnotatedClass(Module.class);
		config.addAnnotatedClass(Tasks.class);
		config.configure();
		
		// first true denotes that whatever sql statement is generated will be printed in console
		// second true say whatever sql is written needs to executed to database
		new SchemaExport(config).create(true, true);
		
		SessionFactory  sessionFactory = config.buildSessionFactory();
		//SessionFactory  sessionFactory = new  Configuration().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Project p =  new Project();
		p.setProjectName("Hibernate Lessons");
		
		Module m = new Module();
		m.setModuleName("Inheritance Module");
		m.setProjectName("Hibernate Module");
		
		Tasks t =  new Tasks();
		t.setTaskName("Java Collections");
		t.setProjectName("Java Lessons");
		t.setModuleName("ArrayList");
		
		session.save(p);
		session.save(m);
		session.save(t);
		
		
		session.getTransaction().commit();
	

	}

}
