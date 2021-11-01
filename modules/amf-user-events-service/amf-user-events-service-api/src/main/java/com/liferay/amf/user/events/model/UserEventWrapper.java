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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserEvent}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEvent
 * @generated
 */
public class UserEventWrapper
	extends BaseModelWrapper<UserEvent>
	implements ModelWrapper<UserEvent>, UserEvent {

	public UserEventWrapper(UserEvent userEvent) {
		super(userEvent);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userEventId", getUserEventId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("userIP", getUserIP());
		attributes.put("eventDate", getEventDate());
		attributes.put("eventType", getEventType());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userEventId = (Long)attributes.get("userEventId");

		if (userEventId != null) {
			setUserEventId(userEventId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String userIP = (String)attributes.get("userIP");

		if (userIP != null) {
			setUserIP(userIP);
		}

		Date eventDate = (Date)attributes.get("eventDate");

		if (eventDate != null) {
			setEventDate(eventDate);
		}

		Integer eventType = (Integer)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	/**
	 * Returns the event date of this user event.
	 *
	 * @return the event date of this user event
	 */
	@Override
	public Date getEventDate() {
		return model.getEventDate();
	}

	/**
	 * Returns the event type of this user event.
	 *
	 * @return the event type of this user event
	 */
	@Override
	public int getEventType() {
		return model.getEventType();
	}

	/**
	 * Returns the group ID of this user event.
	 *
	 * @return the group ID of this user event
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the primary key of this user event.
	 *
	 * @return the primary key of this user event
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user event ID of this user event.
	 *
	 * @return the user event ID of this user event
	 */
	@Override
	public long getUserEventId() {
		return model.getUserEventId();
	}

	/**
	 * Returns the user ID of this user event.
	 *
	 * @return the user ID of this user event
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user ip of this user event.
	 *
	 * @return the user ip of this user event
	 */
	@Override
	public String getUserIP() {
		return model.getUserIP();
	}

	/**
	 * Returns the user name of this user event.
	 *
	 * @return the user name of this user event
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this user event.
	 *
	 * @return the user uuid of this user event
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this user event.
	 *
	 * @return the uuid of this user event
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the event date of this user event.
	 *
	 * @param eventDate the event date of this user event
	 */
	@Override
	public void setEventDate(Date eventDate) {
		model.setEventDate(eventDate);
	}

	/**
	 * Sets the event type of this user event.
	 *
	 * @param eventType the event type of this user event
	 */
	@Override
	public void setEventType(int eventType) {
		model.setEventType(eventType);
	}

	/**
	 * Sets the group ID of this user event.
	 *
	 * @param groupId the group ID of this user event
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the primary key of this user event.
	 *
	 * @param primaryKey the primary key of this user event
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user event ID of this user event.
	 *
	 * @param userEventId the user event ID of this user event
	 */
	@Override
	public void setUserEventId(long userEventId) {
		model.setUserEventId(userEventId);
	}

	/**
	 * Sets the user ID of this user event.
	 *
	 * @param userId the user ID of this user event
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user ip of this user event.
	 *
	 * @param userIP the user ip of this user event
	 */
	@Override
	public void setUserIP(String userIP) {
		model.setUserIP(userIP);
	}

	/**
	 * Sets the user name of this user event.
	 *
	 * @param userName the user name of this user event
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this user event.
	 *
	 * @param userUuid the user uuid of this user event
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this user event.
	 *
	 * @param uuid the uuid of this user event
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected UserEventWrapper wrap(UserEvent userEvent) {
		return new UserEventWrapper(userEvent);
	}

}