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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the UserEvent service. Represents a row in the &quot;UserEvents_UserEvent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.amf.user.events.model.impl.UserEventModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.amf.user.events.model.impl.UserEventImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEvent
 * @generated
 */
@ProviderType
public interface UserEventModel extends BaseModel<UserEvent> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user event model instance should use the {@link UserEvent} interface instead.
	 */

	/**
	 * Returns the primary key of this user event.
	 *
	 * @return the primary key of this user event
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user event.
	 *
	 * @param primaryKey the primary key of this user event
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this user event.
	 *
	 * @return the uuid of this user event
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this user event.
	 *
	 * @param uuid the uuid of this user event
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the user event ID of this user event.
	 *
	 * @return the user event ID of this user event
	 */
	public long getUserEventId();

	/**
	 * Sets the user event ID of this user event.
	 *
	 * @param userEventId the user event ID of this user event
	 */
	public void setUserEventId(long userEventId);

	/**
	 * Returns the user ID of this user event.
	 *
	 * @return the user ID of this user event
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this user event.
	 *
	 * @param userId the user ID of this user event
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user event.
	 *
	 * @return the user uuid of this user event
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user event.
	 *
	 * @param userUuid the user uuid of this user event
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this user event.
	 *
	 * @return the user name of this user event
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this user event.
	 *
	 * @param userName the user name of this user event
	 */
	public void setUserName(String userName);

	/**
	 * Returns the user ip of this user event.
	 *
	 * @return the user ip of this user event
	 */
	@AutoEscape
	public String getUserIP();

	/**
	 * Sets the user ip of this user event.
	 *
	 * @param userIP the user ip of this user event
	 */
	public void setUserIP(String userIP);

	/**
	 * Returns the event date of this user event.
	 *
	 * @return the event date of this user event
	 */
	public Date getEventDate();

	/**
	 * Sets the event date of this user event.
	 *
	 * @param eventDate the event date of this user event
	 */
	public void setEventDate(Date eventDate);

	/**
	 * Returns the event type of this user event.
	 *
	 * @return the event type of this user event
	 */
	public int getEventType();

	/**
	 * Sets the event type of this user event.
	 *
	 * @param eventType the event type of this user event
	 */
	public void setEventType(int eventType);

	/**
	 * Returns the group ID of this user event.
	 *
	 * @return the group ID of this user event
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this user event.
	 *
	 * @param groupId the group ID of this user event
	 */
	public void setGroupId(long groupId);

}