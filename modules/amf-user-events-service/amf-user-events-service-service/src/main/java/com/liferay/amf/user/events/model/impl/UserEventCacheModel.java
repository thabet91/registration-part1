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

package com.liferay.amf.user.events.model.impl;

import com.liferay.amf.user.events.model.UserEvent;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserEvent in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserEventCacheModel
	implements CacheModel<UserEvent>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserEventCacheModel)) {
			return false;
		}

		UserEventCacheModel userEventCacheModel = (UserEventCacheModel)object;

		if (userEventId == userEventCacheModel.userEventId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userEventId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userEventId=");
		sb.append(userEventId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", userIP=");
		sb.append(userIP);
		sb.append(", eventDate=");
		sb.append(eventDate);
		sb.append(", eventType=");
		sb.append(eventType);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserEvent toEntityModel() {
		UserEventImpl userEventImpl = new UserEventImpl();

		if (uuid == null) {
			userEventImpl.setUuid("");
		}
		else {
			userEventImpl.setUuid(uuid);
		}

		userEventImpl.setUserEventId(userEventId);
		userEventImpl.setUserId(userId);

		if (userName == null) {
			userEventImpl.setUserName("");
		}
		else {
			userEventImpl.setUserName(userName);
		}

		if (userIP == null) {
			userEventImpl.setUserIP("");
		}
		else {
			userEventImpl.setUserIP(userIP);
		}

		if (eventDate == Long.MIN_VALUE) {
			userEventImpl.setEventDate(null);
		}
		else {
			userEventImpl.setEventDate(new Date(eventDate));
		}

		userEventImpl.setEventType(eventType);
		userEventImpl.setGroupId(groupId);

		userEventImpl.resetOriginalValues();

		return userEventImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userEventId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		userIP = objectInput.readUTF();
		eventDate = objectInput.readLong();

		eventType = objectInput.readInt();

		groupId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userEventId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (userIP == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userIP);
		}

		objectOutput.writeLong(eventDate);

		objectOutput.writeInt(eventType);

		objectOutput.writeLong(groupId);
	}

	public String uuid;
	public long userEventId;
	public long userId;
	public String userName;
	public String userIP;
	public long eventDate;
	public int eventType;
	public long groupId;

}