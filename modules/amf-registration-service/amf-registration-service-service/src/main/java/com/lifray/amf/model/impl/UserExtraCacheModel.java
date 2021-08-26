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

package com.lifray.amf.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.lifray.amf.model.UserExtra;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserExtra in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserExtraCacheModel
	implements CacheModel<UserExtra>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserExtraCacheModel)) {
			return false;
		}

		UserExtraCacheModel userExtraCacheModel = (UserExtraCacheModel)object;

		if (username.equals(userExtraCacheModel.username)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, username);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", username=");
		sb.append(username);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", mobilePhone=");
		sb.append(mobilePhone);
		sb.append(", homePhone=");
		sb.append(homePhone);
		sb.append(", securityQuestion=");
		sb.append(securityQuestion);
		sb.append(", securityQuestionAnswer=");
		sb.append(securityQuestionAnswer);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserExtra toEntityModel() {
		UserExtraImpl userExtraImpl = new UserExtraImpl();

		if (uuid == null) {
			userExtraImpl.setUuid("");
		}
		else {
			userExtraImpl.setUuid(uuid);
		}

		if (username == null) {
			userExtraImpl.setUsername("");
		}
		else {
			userExtraImpl.setUsername(username);
		}

		userExtraImpl.setUserId(userId);
		userExtraImpl.setMobilePhone(mobilePhone);
		userExtraImpl.setHomePhone(homePhone);

		if (securityQuestion == null) {
			userExtraImpl.setSecurityQuestion("");
		}
		else {
			userExtraImpl.setSecurityQuestion(securityQuestion);
		}

		if (securityQuestionAnswer == null) {
			userExtraImpl.setSecurityQuestionAnswer("");
		}
		else {
			userExtraImpl.setSecurityQuestionAnswer(securityQuestionAnswer);
		}

		userExtraImpl.resetOriginalValues();

		return userExtraImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		username = objectInput.readUTF();

		userId = objectInput.readLong();

		mobilePhone = objectInput.readLong();

		homePhone = objectInput.readLong();
		securityQuestion = objectInput.readUTF();
		securityQuestionAnswer = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		if (username == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(username);
		}

		objectOutput.writeLong(userId);

		objectOutput.writeLong(mobilePhone);

		objectOutput.writeLong(homePhone);

		if (securityQuestion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityQuestion);
		}

		if (securityQuestionAnswer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityQuestionAnswer);
		}
	}

	public String uuid;
	public String username;
	public long userId;
	public long mobilePhone;
	public long homePhone;
	public String securityQuestion;
	public String securityQuestionAnswer;

}