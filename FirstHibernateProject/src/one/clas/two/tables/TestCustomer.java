package one.clas.two.tables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

@SuppressWarnings({ "deprecation" })
public class TestCustomer {

	public static void main(String[] args) {

		AnnotationConfiguration config =  new AnnotationConfiguration();
		config.addAnnotatedClass(Customer.class);
		config.configure();
		
		// first true denotes that whatever sql statement is generated will be printed in console
		// second true say whatever sql is written needs to executed to database
		new SchemaExport(config).create(true, true);
		
		SessionFactory  sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Customer alex = new Customer();
		alex.setCustomerName("Alex");
		alex.setRewardsPoints(2587);
		alex.setCustomerAddress("Banner Road");
		alex.setCreditScore(3000);
		session.save(alex);
		session.getTransaction().commit();
	}

}
