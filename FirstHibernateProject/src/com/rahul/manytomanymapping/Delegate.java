package com.rahul.manytomanymapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Delegate {
	
	private int delegateId;
	private String delegateName;
	List<Event> events = new ArrayList<Event>();
	/**
	 * @return the delegateId
	 */
	@Id
	@GeneratedValue
	public int getDelegateId() {
		return delegateId;
	}
	/**
	 * @param delegateId the delegateId to set
	 */
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	/**
	 * @return the delegateName
	 */
	public String getDelegateName() {
		return delegateName;
	}
	/**
	 * @param delegateName the delegateName to set
	 */
	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}
	/**
	 * @return the events
	 */
	@ManyToMany
	@JoinTable(name="JOIN_DELEGATE_EVENT",
	joinColumns={@JoinColumn(name="delegateId")},
	inverseJoinColumns={@JoinColumn(name="eventId")})
	public List<Event> getEvents() {
		return events;
	}
	/**
	 * @param events the events to set
	 */
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	

}
