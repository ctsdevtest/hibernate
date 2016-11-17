/**
 * 
 */
package com.rahul.entity.basic;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author Admin
 *
 */
@Entity(name="EmployeeInfo")
public class UserDetails {
	
	private int userId;
	private String userName;
	private String userPassword;
	private Date userLoginTime;
	private Calendar userJoiningDate;
	/**
	 * @return the userId
	 */
	@Id
	@Column(name="EMPID")
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	@Column(name="Empname")
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	@Column(name="EmpName", nullable=false)
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userLoginTime
	 */
	@Column(name="Emplogintime")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getUserLoginTime() {
		return userLoginTime;
	}
	/**
	 * @param userLoginTime the userLoginTime to set
	 */
	public void setUserLoginTime(Date userLoginTime) {
		this.userLoginTime = userLoginTime;
	}
	/**
	 * @return the userJoiningDate
	 */
	@Column(name="Empjoiningdate")
	@Temporal(TemporalType.DATE)
	public Calendar getUserJoiningDate() {
		return userJoiningDate;
	}
	/**
	 * @param userJoiningDate the userJoiningDate to set
	 */
	public void setUserJoiningDate(Calendar userJoiningDate) {
		this.userJoiningDate = userJoiningDate;
	}
	/**
	 * @return the userPassword
	 */
	@Column(name="Emppassword")
	// Transient will say not to save the password in table
	@Transient
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	

}
