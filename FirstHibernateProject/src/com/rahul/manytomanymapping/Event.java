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
public class Event {

	private int eventId;
	private String eventName;
	List<Delegate> delegates = new ArrayList<Delegate>();
	/**
	 * @return the eventId
	 */
	@Id
	@GeneratedValue
	public int getEventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the delegates
	 */
	@ManyToMany
	@JoinTable(name="JOIN_DELEGATE_EVENT",
			joinColumns={@JoinColumn(name="eventId")},
			inverseJoinColumns={@JoinColumn(name="delegateId")})
	public List<Delegate> getDelegates() {
		return delegates;
	}
	/**
	 * @param delegates the delegates to set
	 */
	public void setDelegates(List<Delegate> delegates) {
		this.delegates = delegates;
	}
	
	
}
