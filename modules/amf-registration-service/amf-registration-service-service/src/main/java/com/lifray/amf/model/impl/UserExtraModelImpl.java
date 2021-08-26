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

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.lifray.amf.model.UserExtra;
import com.lifray.amf.model.UserExtraModel;
import com.lifray.amf.model.UserExtraSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the UserExtra service. Represents a row in the &quot;AMF_UserExtra&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>UserExtraModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserExtraImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserExtraImpl
 * @generated
 */
@JSON(strict = true)
public class UserExtraModelImpl
	extends BaseModelImpl<UserExtra> implements UserExtraModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user extra model instance should use the <code>UserExtra</code> interface instead.
	 */
	public static final String TABLE_NAME = "AMF_UserExtra";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"username", Types.VARCHAR},
		{"userId", Types.BIGINT}, {"mobilePhone", Types.BIGINT},
		{"homePhone", Types.BIGINT}, {"securityQuestion", Types.VARCHAR},
		{"securityQuestionAnswer", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("username", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("mobilePhone", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("homePhone", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("securityQuestion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("securityQuestionAnswer", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table AMF_UserExtra (uuid_ VARCHAR(75) null,username VARCHAR(75) not null primary key,userId LONG,mobilePhone LONG,homePhone LONG,securityQuestion VARCHAR(75) null,securityQuestionAnswer VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table AMF_UserExtra";

	public static final String ORDER_BY_JPQL =
		" ORDER BY userExtra.username ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY AMF_UserExtra.username ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long USERNAME_COLUMN_BITMASK = 1L;

	public static final long UUID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static UserExtra toModel(UserExtraSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UserExtra model = new UserExtraImpl();

		model.setUuid(soapModel.getUuid());
		model.setUsername(soapModel.getUsername());
		model.setUserId(soapModel.getUserId());
		model.setMobilePhone(soapModel.getMobilePhone());
		model.setHomePhone(soapModel.getHomePhone());
		model.setSecurityQuestion(soapModel.getSecurityQuestion());
		model.setSecurityQuestionAnswer(soapModel.getSecurityQuestionAnswer());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<UserExtra> toModels(UserExtraSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UserExtra> models = new ArrayList<UserExtra>(soapModels.length);

		for (UserExtraSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public UserExtraModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _username;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setUsername(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _username;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return UserExtra.class;
	}

	@Override
	public String getModelClassName() {
		return UserExtra.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<UserExtra, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<UserExtra, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserExtra, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((UserExtra)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<UserExtra, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<UserExtra, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(UserExtra)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<UserExtra, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<UserExtra, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, UserExtra>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			UserExtra.class.getClassLoader(), UserExtra.class,
			ModelWrapper.class);

		try {
			Constructor<UserExtra> constructor =
				(Constructor<UserExtra>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<UserExtra, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<UserExtra, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<UserExtra, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<UserExtra, Object>>();
		Map<String, BiConsumer<UserExtra, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<UserExtra, ?>>();

		attributeGetterFunctions.put("uuid", UserExtra::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<UserExtra, String>)UserExtra::setUuid);
		attributeGetterFunctions.put("username", UserExtra::getUsername);
		attributeSetterBiConsumers.put(
			"username", (BiConsumer<UserExtra, String>)UserExtra::setUsername);
		attributeGetterFunctions.put("userId", UserExtra::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<UserExtra, Long>)UserExtra::setUserId);
		attributeGetterFunctions.put("mobilePhone", UserExtra::getMobilePhone);
		attributeSetterBiConsumers.put(
			"mobilePhone",
			(BiConsumer<UserExtra, Long>)UserExtra::setMobilePhone);
		attributeGetterFunctions.put("homePhone", UserExtra::getHomePhone);
		attributeSetterBiConsumers.put(
			"homePhone", (BiConsumer<UserExtra, Long>)UserExtra::setHomePhone);
		attributeGetterFunctions.put(
			"securityQuestion", UserExtra::getSecurityQuestion);
		attributeSetterBiConsumers.put(
			"securityQuestion",
			(BiConsumer<UserExtra, String>)UserExtra::setSecurityQuestion);
		attributeGetterFunctions.put(
			"securityQuestionAnswer", UserExtra::getSecurityQuestionAnswer);
		attributeSetterBiConsumers.put(
			"securityQuestionAnswer",
			(BiConsumer<UserExtra, String>)
				UserExtra::setSecurityQuestionAnswer);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public String getUsername() {
		if (_username == null) {
			return "";
		}
		else {
			return _username;
		}
	}

	@Override
	public void setUsername(String username) {
		_columnBitmask |= USERNAME_COLUMN_BITMASK;

		if (_originalUsername == null) {
			_originalUsername = _username;
		}

		_username = username;
	}

	public String getOriginalUsername() {
		return GetterUtil.getString(_originalUsername);
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public long getMobilePhone() {
		return _mobilePhone;
	}

	@Override
	public void setMobilePhone(long mobilePhone) {
		_mobilePhone = mobilePhone;
	}

	@JSON
	@Override
	public long getHomePhone() {
		return _homePhone;
	}

	@Override
	public void setHomePhone(long homePhone) {
		_homePhone = homePhone;
	}

	@JSON
	@Override
	public String getSecurityQuestion() {
		if (_securityQuestion == null) {
			return "";
		}
		else {
			return _securityQuestion;
		}
	}

	@Override
	public void setSecurityQuestion(String securityQuestion) {
		_securityQuestion = securityQuestion;
	}

	@JSON
	@Override
	public String getSecurityQuestionAnswer() {
		if (_securityQuestionAnswer == null) {
			return "";
		}
		else {
			return _securityQuestionAnswer;
		}
	}

	@Override
	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		_securityQuestionAnswer = securityQuestionAnswer;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public UserExtra toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, UserExtra>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserExtraImpl userExtraImpl = new UserExtraImpl();

		userExtraImpl.setUuid(getUuid());
		userExtraImpl.setUsername(getUsername());
		userExtraImpl.setUserId(getUserId());
		userExtraImpl.setMobilePhone(getMobilePhone());
		userExtraImpl.setHomePhone(getHomePhone());
		userExtraImpl.setSecurityQuestion(getSecurityQuestion());
		userExtraImpl.setSecurityQuestionAnswer(getSecurityQuestionAnswer());

		userExtraImpl.resetOriginalValues();

		return userExtraImpl;
	}

	@Override
	public int compareTo(UserExtra userExtra) {
		String primaryKey = userExtra.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserExtra)) {
			return false;
		}

		UserExtra userExtra = (UserExtra)object;

		String primaryKey = userExtra.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		UserExtraModelImpl userExtraModelImpl = this;

		userExtraModelImpl._originalUuid = userExtraModelImpl._uuid;

		userExtraModelImpl._originalUsername = userExtraModelImpl._username;

		userExtraModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UserExtra> toCacheModel() {
		UserExtraCacheModel userExtraCacheModel = new UserExtraCacheModel();

		userExtraCacheModel.uuid = getUuid();

		String uuid = userExtraCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			userExtraCacheModel.uuid = null;
		}

		userExtraCacheModel.username = getUsername();

		String username = userExtraCacheModel.username;

		if ((username != null) && (username.length() == 0)) {
			userExtraCacheModel.username = null;
		}

		userExtraCacheModel.userId = getUserId();

		userExtraCacheModel.mobilePhone = getMobilePhone();

		userExtraCacheModel.homePhone = getHomePhone();

		userExtraCacheModel.securityQuestion = getSecurityQuestion();

		String securityQuestion = userExtraCacheModel.securityQuestion;

		if ((securityQuestion != null) && (securityQuestion.length() == 0)) {
			userExtraCacheModel.securityQuestion = null;
		}

		userExtraCacheModel.securityQuestionAnswer =
			getSecurityQuestionAnswer();

		String securityQuestionAnswer =
			userExtraCacheModel.securityQuestionAnswer;

		if ((securityQuestionAnswer != null) &&
			(securityQuestionAnswer.length() == 0)) {

			userExtraCacheModel.securityQuestionAnswer = null;
		}

		return userExtraCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<UserExtra, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<UserExtra, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserExtra, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((UserExtra)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<UserExtra, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<UserExtra, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserExtra, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((UserExtra)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, UserExtra>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private String _username;
	private String _originalUsername;
	private long _userId;
	private long _mobilePhone;
	private long _homePhone;
	private String _securityQuestion;
	private String _securityQuestionAnswer;
	private long _columnBitmask;
	private UserExtra _escapedModel;

}