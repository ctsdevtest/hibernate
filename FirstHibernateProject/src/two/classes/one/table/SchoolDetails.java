package two.classes.one.table;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetails {

	private String schoolAddress;
	private boolean isPublicSchool;
	private int studentCount;
	/**
	 * @return the schoolAddress
	 */
	public String getSchoolAddress() {
		return schoolAddress;
	}
	/**
	 * @param schoolAddress the schoolAddress to set
	 */
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	/**
	 * @return the isPublicSchool
	 */
	public boolean isPublicSchool() {
		return isPublicSchool;
	}
	/**
	 * @param isPublicSchool the isPublicSchool to set
	 */
	public void setPublicSchool(boolean isPublicSchool) {
		this.isPublicSchool = isPublicSchool;
	}
	/**
	 * @return the studentCount
	 */
	public int getStudentCount() {
		return studentCount;
	}
	/**
	 * @param studentCount the studentCount to set
	 */
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
	
}
