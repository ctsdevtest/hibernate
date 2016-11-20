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
@Table(name="TemporaryEmployee")  
@PrimaryKeyJoinColumn(name="ID")  
public class TemporaryEmployee extends Employee {

	@Column(name = "Working_Days")
	private short workingDays;
	
	@Column(name = "Contractor_Name")
	String contractorName;

	public TemporaryEmployee() {
		// TODO Auto-generated constructor stub
	}

	public short getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(short workingDays) {
		this.workingDays = workingDays;
	}

	public String getContractorName() {
		return contractorName;
	}

	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
}
