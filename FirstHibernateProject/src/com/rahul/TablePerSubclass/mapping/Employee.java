/**
 * 
 */
package com.rahul.TablePerSubclass.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author RAHUL
 *
 */
@Entity  
@Table(name = "EMPLOYEE")  
@Inheritance(strategy=InheritanceType.JOINED)  
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private short empId;
	
	@Column(name = "EMP_NAME")  
	private String empName;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public short getEmpId() {
		return empId;
	}

	public void setEmpId(short empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}