/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.amf.user.events.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.amf.user.events.service.http.UserEventServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UserEventSoap implements Serializable {

	public static UserEventSoap toSoapModel(UserEvent model) {
		UserEventSoap soapModel = new UserEventSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUserEventId(model.getUserEventId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setUserIP(model.getUserIP());
		soapModel.setEventDate(model.getEventDate());
		soapModel.setEventType(model.getEventType());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static UserEventSoap[] toSoapModels(UserEvent[] models) {
		UserEventSoap[] soapModels = new UserEventSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserEventSoap[][] toSoapModels(UserEvent[][] models) {
		UserEventSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserEventSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserEventSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserEventSoap[] toSoapModels(List<UserEvent> models) {
		List<UserEventSoap> soapModels = new ArrayList<UserEventSoap>(
			models.size());

		for (UserEvent model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserEventSoap[soapModels.size()]);
	}

	public UserEventSoap() {
	}

	public long getPrimaryKey() {
		return _userEventId;
	}

	public void setPrimaryKey(long pk) {
		setUserEventId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUserEventId() {
		return _userEventId;
	}

	public void setUserEventId(long userEventId) {
		_userEventId = userEventId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getUserIP() {
		return _userIP;
	}

	public void setUserIP(String userIP) {
		_userIP = userIP;
	}

	public Date getEventDate() {
		return _eventDate;
	}

	public void setEventDate(Date eventDate) {
		_eventDate = eventDate;
	}

	public int getEventType() {
		return _eventType;
	}

	public void setEventType(int eventType) {
		_eventType = eventType;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	private String _uuid;
	private long _userEventId;
	private long _userId;
	private String _userName;
	private String _userIP;
	private Date _eventDate;
	private int _eventType;
	private long _groupId;

}