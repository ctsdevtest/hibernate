package com.rahul.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.rahul.onetoone.Person;
import com.rahul.onetoone.PersonDetails;

@SuppressWarnings({ "deprecation", "unused" })
public class TestStudent {

	public static void main(String[] args) {

		AnnotationConfiguration config =  new AnnotationConfiguration();
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(College.class);
		config.configure();
		
		// first true denotes that whatever sql statement is generated will be printed in console
		// second true say whatever sql is written needs to executed to database
		new SchemaExport(config).create(true, true);
		
		SessionFactory  sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		College college1 = new College();
		college1.setCollegeName("PCEA");
		
		Student stud1 = new Student();
		stud1.setStudentName("Ajay");
		stud1.setCollege(college1);
		
		Student stud2 = new Student();
		stud2.setStudentName("Bijay");
		stud2.setCollege(college1);

		session.save(college1);
		session.save(stud1);
		session.save(stud2);
		
		// No need if we set the cascade type 
		//session.save(personDetails);
		session.getTransaction().commit();
	}

}
