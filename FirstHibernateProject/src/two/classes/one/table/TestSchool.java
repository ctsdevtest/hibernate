/**
 * 
 */
package two.classes.one.table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.rahul.entity.basic.UserDetails;

/**
 * @author Admin
 *
 */
@SuppressWarnings({ "deprecation", "unused" })
public class TestSchool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(School.class);
		config.addAnnotatedClass(SchoolDetails.class);
		config.configure();// to read configuration file

		// To create the table
		new SchemaExport(config).create(true, true);
		School dps =  new School();
		dps.setSchoolName("Delhi pubic");
		
		SchoolDetails schoolDetails = new SchoolDetails();
		schoolDetails.setPublicSchool(true);
		schoolDetails.setSchoolAddress("R K PURAM");
		schoolDetails.setStudentCount(500);
		dps.setSchoolDetails(schoolDetails);
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		session.save(dps);
		session.getTransaction().commit();

	}

}
