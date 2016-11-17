package com.rahul.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	private int personId;
	private String personName;
	private PersonDetails personDetails;
	/**
	 * @return the personId
	 */
	@Id
	@GeneratedValue
	public int getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * @return the personDetails
	 */
	// Person and person details both are loaded
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pDetail_FK")
	public PersonDetails getPersonDetails() {
		return personDetails;
	}
	/**
	 * @param personDetails the personDetails to set
	 */
	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}
	
	

}
