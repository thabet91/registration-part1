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

package com.lifray.amf.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserExtraLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserExtraLocalService
 * @generated
 */
public class UserExtraLocalServiceWrapper
	implements ServiceWrapper<UserExtraLocalService>, UserExtraLocalService {

	public UserExtraLocalServiceWrapper(
		UserExtraLocalService userExtraLocalService) {

		_userExtraLocalService = userExtraLocalService;
	}

	/**
	 * Adds the user extra to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserExtraLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userExtra the user extra
	 * @return the user extra that was added
	 */
	@Override
	public com.lifray.amf.model.UserExtra addUserExtra(
		com.lifray.amf.model.UserExtra userExtra) {

		return _userExtraLocalService.addUserExtra(userExtra);
	}

	@Override
	public com.lifray.amf.model.UserExtra addUserExtras(
			String username, long userId, long mobilePhone, long homePhone,
			String securityQuestion, String securityAnswer)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userExtraLocalService.addUserExtras(
			username, userId, mobilePhone, homePhone, securityQuestion,
			securityAnswer);
	}

	@Override
	public com.lifray.amf.model.UserExtra addUserExtras(
			String username, long mobilePhone, long homePhone,
			String securityQuestion, String securityAnswer,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userExtraLocalService.addUserExtras(
			username, mobilePhone, homePhone, securityQuestion, securityAnswer,
			serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userExtraLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new user extra with the primary key. Does not add the user extra to the database.
	 *
	 * @param username the primary key for the new user extra
	 * @return the new user extra
	 */
	@Override
	public com.lifray.amf.model.UserExtra createUserExtra(String username) {
		return _userExtraLocalService.createUserExtra(username);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userExtraLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the user extra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserExtraLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra that was removed
	 * @throws PortalException if a user extra with the primary key could not be found
	 */
	@Override
	public com.lifray.amf.model.UserExtra deleteUserExtra(String username)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userExtraLocalService.deleteUserExtra(username);
	}

	/**
	 * Deletes the user extra from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserExtraLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userExtra the user extra
	 * @return the user extra that was removed
	 */
	@Override
	public com.lifray.amf.model.UserExtra deleteUserExtra(
		com.lifray.amf.model.UserExtra userExtra) {

		return _userExtraLocalService.deleteUserExtra(userExtra);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userExtraLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userExtraLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lifray.amf.model.impl.UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _userExtraLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lifray.amf.model.impl.UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _userExtraLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userExtraLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _userExtraLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.lifray.amf.model.UserExtra fetchUserExtra(String username) {
		return _userExtraLocalService.fetchUserExtra(username);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userExtraLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userExtraLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the user extra with the primary key.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra
	 * @throws PortalException if a user extra with the primary key could not be found
	 */
	@Override
	public com.lifray.amf.model.UserExtra getUserExtra(String username)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userExtraLocalService.getUserExtra(username);
	}

	/**
	 * Returns a range of all the user extras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lifray.amf.model.impl.UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @return the range of user extras
	 */
	@Override
	public java.util.List<com.lifray.amf.model.UserExtra> getUserExtras(
		int start, int end) {

		return _userExtraLocalService.getUserExtras(start, end);
	}

	/**
	 * Returns the number of user extras.
	 *
	 * @return the number of user extras
	 */
	@Override
	public int getUserExtrasCount() {
		return _userExtraLocalService.getUserExtrasCount();
	}

	/**
	 * Updates the user extra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserExtraLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userExtra the user extra
	 * @return the user extra that was updated
	 */
	@Override
	public com.lifray.amf.model.UserExtra updateUserExtra(
		com.lifray.amf.model.UserExtra userExtra) {

		return _userExtraLocalService.updateUserExtra(userExtra);
	}

	@Override
	public UserExtraLocalService getWrappedService() {
		return _userExtraLocalService;
	}

	@Override
	public void setWrappedService(UserExtraLocalService userExtraLocalService) {
		_userExtraLocalService = userExtraLocalService;
	}

	private UserExtraLocalService _userExtraLocalService;

}