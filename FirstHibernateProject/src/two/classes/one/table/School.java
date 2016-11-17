package two.classes.one.table;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="School")
public class School {
	
	private int schoolId;
	private String schoolName;
	private SchoolDetails schoolDetails;
	
	/**
	 * @return the schoolId
	 */
	@Id
	@GeneratedValue
	public int getSchoolId() {
		return schoolId;
	}
	/**
	 * @param schoolId the schoolId to set
	 */
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}
	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	/**
	 * @return the schoolDetails
	 */
	@Embedded
	public SchoolDetails getSchoolDetails() {
		return schoolDetails;
	}
	/**
	 * @param schoolDetails the schoolDetails to set
	 */
	public void setSchoolDetails(SchoolDetails schoolDetails) {
		this.schoolDetails = schoolDetails;
	}
	
	

}	
