/**
 * 
 */
package com.rahul.TablePerHierarchy.mapping;

import javax.persistence.*;

/**
 * @author RAHUL
 *
 */
@Entity  
@Table(name = "EMPLOYEE")  
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
public class Employee {

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
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