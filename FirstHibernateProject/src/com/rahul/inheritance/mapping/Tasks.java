package com.rahul.inheritance.mapping;

import javax.persistence.Entity;

@Entity
public class Tasks extends Module{

	private String taskName;

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	
}
