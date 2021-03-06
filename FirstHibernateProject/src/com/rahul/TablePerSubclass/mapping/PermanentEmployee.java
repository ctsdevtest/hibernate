/**
 * 
 */
package com.rahul.TablePerSubclass.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author RAHUL
 *
 */
@Entity  
@Table(name="PermanentEmployee")  
@PrimaryKeyJoinColumn(name="ID")  
public class PermanentEmployee extends Employee {

	@Column(name = "Designation")
	private String designation;
	@Column(name = "Department")
	private String department;

	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

