/**
 * 
 */
package com.rahul.TablePerConcrete.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * @author RAHUL
 *
 */
public class TablePerConcreteClassHierarchy {
	public static void main(String[] args) 
	  {
	    Configuration config = new Configuration();
	    config.addAnnotatedClass(PermanentEmployee.class);
		config.addAnnotatedClass(TemporaryEmployee.class);
		config.addAnnotatedClass(Employee.class);
		config.configure("hibernate.cfg.xml"); 
			 
	    SessionFactory sf = config.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Employee e1 = new Employee();
	    e1.setEmpName("Rahul");
	    // create two objects of PermanentEmployee
	    PermanentEmployee p1 = new PermanentEmployee();
	    p1.setEmpId((short)100);
	    p1.setEmpName("Rahul Srivastava");
	    p1.setDesignation("Software Engineer");
	    p1.setDepartment("JAVA");
			
	    PermanentEmployee p2 = new PermanentEmployee();
	    p2.setEmpId((short)101);
	    p2.setEmpName("Shubhi");
	    p2.setDesignation("Engineer");
	    p2.setDepartment("Dot Net");
	    
	    // create two objects of TemporaryEmployee
	    TemporaryEmployee t1 = new TemporaryEmployee();
	    t1.setEmpId((short)102);
	    t1.setEmpName("Rajesh");
	    t1.setWorkingDays((short)28);
	    t1.setContractorName("Barclays");
			        
	    TemporaryEmployee t2 = new TemporaryEmployee();
	    t2.setEmpId((short)103);
	    t2.setEmpName("Jyoti");
	    t2.setWorkingDays((short)22);
	    t2.setContractorName("Veritas");
	    
	    // now save all four objects
	    Transaction tx = session.beginTransaction();
	    session.save(e1);
	    session.save(p1);   session.save(t1);
	    session.save(p2);   session.save(t2);
	 
	    tx.commit();  session.close();   sf.close();
	    System.out.println("Objects saved");
	  }
}
