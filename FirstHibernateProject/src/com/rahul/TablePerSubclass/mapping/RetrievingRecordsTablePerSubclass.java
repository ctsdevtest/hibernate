package com.rahul.TablePerSubclass.mapping;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrievingRecordsTablePerSubclass {
	 public static void main(String[] args)
	  {
	    Configuration config= new Configuration();
	    config.addAnnotatedClass(PermanentEmployee.class);
		config.addAnnotatedClass(TemporaryEmployee.class);
		config.addAnnotatedClass(Employee.class);
	    config.configure("/hibernate.cfg.xml");
	    SessionFactory sf=config.buildSessionFactory();
	    Session s=sf.openSession();
		
	    Query q = s.createQuery("FROM PermanentEmployee");
	    List<PermanentEmployee> myList = q.list();
	    for(PermanentEmployee p1 :myList) 
	    {
	      System.out.println(p1.getEmpId()+ ", " + p1.getEmpName() + ", " + p1.getDesignation() + ", " + p1.getDepartment());
	    }

	    Query q1 = s.createQuery("FROM TemporaryEmployee");
	    List<TemporaryEmployee> yourList = q1.list();
	    for(TemporaryEmployee t1 : yourList)
	    {
	      System.out.println(t1.getEmpId()+ ", " + t1.getEmpName() + ", " + t1.getWorkingDays() + ", " + t1.getContractorName());
	    }
	  } 

}
