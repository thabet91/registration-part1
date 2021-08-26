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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserExtra}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserExtra
 * @generated
 */
public class UserExtraWrapper
	extends BaseModelWrapper<UserExtra>
	implements ModelWrapper<UserExtra>, UserExtra {

	public UserExtraWrapper(UserExtra userExtra) {
		super(userExtra);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("username", getUsername());
		attributes.put("userId", getUserId());
		attributes.put("mobilePhone", getMobilePhone());
		attributes.put("homePhone", getHomePhone());
		attributes.put("securityQuestion", getSecurityQuestion());
		attributes.put("securityQuestionAnswer", getSecurityQuestionAnswer());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long mobilePhone = (Long)attributes.get("mobilePhone");

		if (mobilePhone != null) {
			setMobilePhone(mobilePhone);
		}

		Long homePhone = (Long)attributes.get("homePhone");

		if (homePhone != null) {
			setHomePhone(homePhone);
		}

		String securityQuestion = (String)attributes.get("securityQuestion");

		if (securityQuestion != null) {
			setSecurityQuestion(securityQuestion);
		}

		String securityQuestionAnswer = (String)attributes.get(
			"securityQuestionAnswer");

		if (securityQuestionAnswer != null) {
			setSecurityQuestionAnswer(securityQuestionAnswer);
		}
	}

	/**
	 * Returns the home phone of this user extra.
	 *
	 * @return the home phone of this user extra
	 */
	@Override
	public long getHomePhone() {
		return model.getHomePhone();
	}

	/**
	 * Returns the mobile phone of this user extra.
	 *
	 * @return the mobile phone of this user extra
	 */
	@Override
	public long getMobilePhone() {
		return model.getMobilePhone();
	}

	/**
	 * Returns the primary key of this user extra.
	 *
	 * @return the primary key of this user extra
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the security question of this user extra.
	 *
	 * @return the security question of this user extra
	 */
	@Override
	public String getSecurityQuestion() {
		return model.getSecurityQuestion();
	}

	/**
	 * Returns the security question answer of this user extra.
	 *
	 * @return the security question answer of this user extra
	 */
	@Override
	public String getSecurityQuestionAnswer() {
		return model.getSecurityQuestionAnswer();
	}

	/**
	 * Returns the user ID of this user extra.
	 *
	 * @return the user ID of this user extra
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the username of this user extra.
	 *
	 * @return the username of this user extra
	 */
	@Override
	public String getUsername() {
		return model.getUsername();
	}

	/**
	 * Returns the user uuid of this user extra.
	 *
	 * @return the user uuid of this user extra
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this user extra.
	 *
	 * @return the uuid of this user extra
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
	 * Sets the home phone of this user extra.
	 *
	 * @param homePhone the home phone of this user extra
	 */
	@Override
	public void setHomePhone(long homePhone) {
		model.setHomePhone(homePhone);
	}

	/**
	 * Sets the mobile phone of this user extra.
	 *
	 * @param mobilePhone the mobile phone of this user extra
	 */
	@Override
	public void setMobilePhone(long mobilePhone) {
		model.setMobilePhone(mobilePhone);
	}

	/**
	 * Sets the primary key of this user extra.
	 *
	 * @param primaryKey the primary key of this user extra
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the security question of this user extra.
	 *
	 * @param securityQuestion the security question of this user extra
	 */
	@Override
	public void setSecurityQuestion(String securityQuestion) {
		model.setSecurityQuestion(securityQuestion);
	}

	/**
	 * Sets the security question answer of this user extra.
	 *
	 * @param securityQuestionAnswer the security question answer of this user extra
	 */
	@Override
	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		model.setSecurityQuestionAnswer(securityQuestionAnswer);
	}

	/**
	 * Sets the user ID of this user extra.
	 *
	 * @param userId the user ID of this user extra
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the username of this user extra.
	 *
	 * @param username the username of this user extra
	 */
	@Override
	public void setUsername(String username) {
		model.setUsername(username);
	}

	/**
	 * Sets the user uuid of this user extra.
	 *
	 * @param userUuid the user uuid of this user extra
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this user extra.
	 *
	 * @param uuid the uuid of this user extra
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected UserExtraWrapper wrap(UserExtra userExtra) {
		return new UserExtraWrapper(userExtra);
	}

}