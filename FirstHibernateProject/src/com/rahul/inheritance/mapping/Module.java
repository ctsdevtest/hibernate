package com.rahul.inheritance.mapping;

import javax.persistence.Entity;

@Entity
public class Module extends Project {
	
	private String moduleName;

	/**
	 * @return the moduleName
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * @param moduleName the moduleName to set
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	

}
