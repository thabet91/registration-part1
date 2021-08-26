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

package com.lifray.amf.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lifray.amf.service.http.UserExtraServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UserExtraSoap implements Serializable {

	public static UserExtraSoap toSoapModel(UserExtra model) {
		UserExtraSoap soapModel = new UserExtraSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUsername(model.getUsername());
		soapModel.setUserId(model.getUserId());
		soapModel.setMobilePhone(model.getMobilePhone());
		soapModel.setHomePhone(model.getHomePhone());
		soapModel.setSecurityQuestion(model.getSecurityQuestion());
		soapModel.setSecurityQuestionAnswer(model.getSecurityQuestionAnswer());

		return soapModel;
	}

	public static UserExtraSoap[] toSoapModels(UserExtra[] models) {
		UserExtraSoap[] soapModels = new UserExtraSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserExtraSoap[][] toSoapModels(UserExtra[][] models) {
		UserExtraSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserExtraSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserExtraSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserExtraSoap[] toSoapModels(List<UserExtra> models) {
		List<UserExtraSoap> soapModels = new ArrayList<UserExtraSoap>(
			models.size());

		for (UserExtra model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserExtraSoap[soapModels.size()]);
	}

	public UserExtraSoap() {
	}

	public String getPrimaryKey() {
		return _username;
	}

	public void setPrimaryKey(String pk) {
		setUsername(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getMobilePhone() {
		return _mobilePhone;
	}

	public void setMobilePhone(long mobilePhone) {
		_mobilePhone = mobilePhone;
	}

	public long getHomePhone() {
		return _homePhone;
	}

	public void setHomePhone(long homePhone) {
		_homePhone = homePhone;
	}

	public String getSecurityQuestion() {
		return _securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		_securityQuestion = securityQuestion;
	}

	public String getSecurityQuestionAnswer() {
		return _securityQuestionAnswer;
	}

	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		_securityQuestionAnswer = securityQuestionAnswer;
	}

	private String _uuid;
	private String _username;
	private long _userId;
	private long _mobilePhone;
	private long _homePhone;
	private String _securityQuestion;
	private String _securityQuestionAnswer;

}