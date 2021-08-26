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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for UserExtra. This utility wraps
 * <code>com.lifray.amf.service.impl.UserExtraLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UserExtraLocalService
 * @generated
 */
public class UserExtraLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.lifray.amf.service.impl.UserExtraLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static com.lifray.amf.model.UserExtra addUserExtra(
		com.lifray.amf.model.UserExtra userExtra) {

		return getService().addUserExtra(userExtra);
	}

	public static com.lifray.amf.model.UserExtra addUserExtras(
			String username, long userId, long mobilePhone, long homePhone,
			String securityQuestion, String securityAnswer)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addUserExtras(
			username, userId, mobilePhone, homePhone, securityQuestion,
			securityAnswer);
	}

	public static com.lifray.amf.model.UserExtra addUserExtras(
			String username, long mobilePhone, long homePhone,
			String securityQuestion, String securityAnswer,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addUserExtras(
			username, mobilePhone, homePhone, securityQuestion, securityAnswer,
			serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new user extra with the primary key. Does not add the user extra to the database.
	 *
	 * @param username the primary key for the new user extra
	 * @return the new user extra
	 */
	public static com.lifray.amf.model.UserExtra createUserExtra(
		String username) {

		return getService().createUserExtra(username);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static com.lifray.amf.model.UserExtra deleteUserExtra(
			String username)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteUserExtra(username);
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
	public static com.lifray.amf.model.UserExtra deleteUserExtra(
		com.lifray.amf.model.UserExtra userExtra) {

		return getService().deleteUserExtra(userExtra);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.lifray.amf.model.UserExtra fetchUserExtra(
		String username) {

		return getService().fetchUserExtra(username);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the user extra with the primary key.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra
	 * @throws PortalException if a user extra with the primary key could not be found
	 */
	public static com.lifray.amf.model.UserExtra getUserExtra(String username)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getUserExtra(username);
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
	public static java.util.List<com.lifray.amf.model.UserExtra> getUserExtras(
		int start, int end) {

		return getService().getUserExtras(start, end);
	}

	/**
	 * Returns the number of user extras.
	 *
	 * @return the number of user extras
	 */
	public static int getUserExtrasCount() {
		return getService().getUserExtrasCount();
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
	public static com.lifray.amf.model.UserExtra updateUserExtra(
		com.lifray.amf.model.UserExtra userExtra) {

		return getService().updateUserExtra(userExtra);
	}

	public static UserExtraLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UserExtraLocalService, UserExtraLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UserExtraLocalService.class);

		ServiceTracker<UserExtraLocalService, UserExtraLocalService>
			serviceTracker =
				new ServiceTracker
					<UserExtraLocalService, UserExtraLocalService>(
						bundle.getBundleContext(), UserExtraLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}