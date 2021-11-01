package com.liferay.amf.user.events.dto;

import com.liferay.amf.user.events.model.UserEvent;

import java.text.SimpleDateFormat;

public class UserEventsDTO {
	private String eventDate;
	private String user;
	private String userIP;
	private String eventType;
	
	
	public UserEventsDTO (UserEvent userEvent) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		eventDate = sdf.format(userEvent.getEventType());
		user = userEvent.getUserName()+" ("+userEvent.getUserId()+")";
		userIP= userEvent.getUserIP();
		if(userEvent.getEventType() ==0)
			eventType ="Login";
		else
			eventType="Registration";
	}


	public String getEventDate() {
		return eventDate;
	}


	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getUserIP() {
		return userIP;
	}


	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}


	public String getEventType() {
		return eventType;
	}


	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	

}
