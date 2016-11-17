package com.rahul.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonDetails {
	
	private int personDetailId;
	private String zipCode;
	private String job;
	private double income;
	
	private Person person;
	/**
	 * @return the personDetailId
	 */
	@Id
	@GeneratedValue
	@Column(name="detailId_PK")
	public int getPersonDetailId() {
		return personDetailId;
	}
	/**
	 * @param personDetailId the personDetailId to set
	 */
	public void setPersonDetailId(int personDetailId) {
		this.personDetailId = personDetailId;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return the income
	 */
	public double getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(double income) {
		this.income = income;
	}
	/**
	 * @return the person
	 */	
	@OneToOne(mappedBy="personDetails", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
