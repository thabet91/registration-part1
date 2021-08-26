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

package com.lifray.amf.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.lifray.amf.model.UserExtra;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the user extra service. This utility wraps <code>com.lifray.amf.service.persistence.impl.UserExtraPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserExtraPersistence
 * @generated
 */
public class UserExtraUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(UserExtra userExtra) {
		getPersistence().clearCache(userExtra);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, UserExtra> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserExtra> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserExtra> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserExtra> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UserExtra> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UserExtra update(UserExtra userExtra) {
		return getPersistence().update(userExtra);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UserExtra update(
		UserExtra userExtra, ServiceContext serviceContext) {

		return getPersistence().update(userExtra, serviceContext);
	}

	/**
	 * Returns all the user extras where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user extras
	 */
	public static List<UserExtra> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the user extras where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @return the range of matching user extras
	 */
	public static List<UserExtra> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the user extras where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user extras
	 */
	public static List<UserExtra> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<UserExtra> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user extras where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user extras
	 */
	public static List<UserExtra> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<UserExtra> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	public static UserExtra findByUuid_First(
			String uuid, OrderByComparator<UserExtra> orderByComparator)
		throws com.lifray.amf.exception.NoSuchUserExtraException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	public static UserExtra fetchByUuid_First(
		String uuid, OrderByComparator<UserExtra> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	public static UserExtra findByUuid_Last(
			String uuid, OrderByComparator<UserExtra> orderByComparator)
		throws com.lifray.amf.exception.NoSuchUserExtraException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	public static UserExtra fetchByUuid_Last(
		String uuid, OrderByComparator<UserExtra> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the user extras before and after the current user extra in the ordered set where uuid = &#63;.
	 *
	 * @param username the primary key of the current user extra
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user extra
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	public static UserExtra[] findByUuid_PrevAndNext(
			String username, String uuid,
			OrderByComparator<UserExtra> orderByComparator)
		throws com.lifray.amf.exception.NoSuchUserExtraException {

		return getPersistence().findByUuid_PrevAndNext(
			username, uuid, orderByComparator);
	}

	/**
	 * Removes all the user extras where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of user extras where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user extras
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the user extras where username = &#63;.
	 *
	 * @param username the username
	 * @return the matching user extras
	 */
	public static List<UserExtra> findByUsername(String username) {
		return getPersistence().findByUsername(username);
	}

	/**
	 * Returns a range of all the user extras where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @return the range of matching user extras
	 */
	public static List<UserExtra> findByUsername(
		String username, int start, int end) {

		return getPersistence().findByUsername(username, start, end);
	}

	/**
	 * Returns an ordered range of all the user extras where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user extras
	 */
	public static List<UserExtra> findByUsername(
		String username, int start, int end,
		OrderByComparator<UserExtra> orderByComparator) {

		return getPersistence().findByUsername(
			username, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user extras where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user extras
	 */
	public static List<UserExtra> findByUsername(
		String username, int start, int end,
		OrderByComparator<UserExtra> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUsername(
			username, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	public static UserExtra findByUsername_First(
			String username, OrderByComparator<UserExtra> orderByComparator)
		throws com.lifray.amf.exception.NoSuchUserExtraException {

		return getPersistence().findByUsername_First(
			username, orderByComparator);
	}

	/**
	 * Returns the first user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	public static UserExtra fetchByUsername_First(
		String username, OrderByComparator<UserExtra> orderByComparator) {

		return getPersistence().fetchByUsername_First(
			username, orderByComparator);
	}

	/**
	 * Returns the last user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	public static UserExtra findByUsername_Last(
			String username, OrderByComparator<UserExtra> orderByComparator)
		throws com.lifray.amf.exception.NoSuchUserExtraException {

		return getPersistence().findByUsername_Last(
			username, orderByComparator);
	}

	/**
	 * Returns the last user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	public static UserExtra fetchByUsername_Last(
		String username, OrderByComparator<UserExtra> orderByComparator) {

		return getPersistence().fetchByUsername_Last(
			username, orderByComparator);
	}

	/**
	 * Removes all the user extras where username = &#63; from the database.
	 *
	 * @param username the username
	 */
	public static void removeByUsername(String username) {
		getPersistence().removeByUsername(username);
	}

	/**
	 * Returns the number of user extras where username = &#63;.
	 *
	 * @param username the username
	 * @return the number of matching user extras
	 */
	public static int countByUsername(String username) {
		return getPersistence().countByUsername(username);
	}

	/**
	 * Caches the user extra in the entity cache if it is enabled.
	 *
	 * @param userExtra the user extra
	 */
	public static void cacheResult(UserExtra userExtra) {
		getPersistence().cacheResult(userExtra);
	}

	/**
	 * Caches the user extras in the entity cache if it is enabled.
	 *
	 * @param userExtras the user extras
	 */
	public static void cacheResult(List<UserExtra> userExtras) {
		getPersistence().cacheResult(userExtras);
	}

	/**
	 * Creates a new user extra with the primary key. Does not add the user extra to the database.
	 *
	 * @param username the primary key for the new user extra
	 * @return the new user extra
	 */
	public static UserExtra create(String username) {
		return getPersistence().create(username);
	}

	/**
	 * Removes the user extra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra that was removed
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	public static UserExtra remove(String username)
		throws com.lifray.amf.exception.NoSuchUserExtraException {

		return getPersistence().remove(username);
	}

	public static UserExtra updateImpl(UserExtra userExtra) {
		return getPersistence().updateImpl(userExtra);
	}

	/**
	 * Returns the user extra with the primary key or throws a <code>NoSuchUserExtraException</code> if it could not be found.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	public static UserExtra findByPrimaryKey(String username)
		throws com.lifray.amf.exception.NoSuchUserExtraException {

		return getPersistence().findByPrimaryKey(username);
	}

	/**
	 * Returns the user extra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra, or <code>null</code> if a user extra with the primary key could not be found
	 */
	public static UserExtra fetchByPrimaryKey(String username) {
		return getPersistence().fetchByPrimaryKey(username);
	}

	/**
	 * Returns all the user extras.
	 *
	 * @return the user extras
	 */
	public static List<UserExtra> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the user extras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @return the range of user extras
	 */
	public static List<UserExtra> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the user extras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user extras
	 */
	public static List<UserExtra> findAll(
		int start, int end, OrderByComparator<UserExtra> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user extras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserExtraModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user extras
	 * @param end the upper bound of the range of user extras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user extras
	 */
	public static List<UserExtra> findAll(
		int start, int end, OrderByComparator<UserExtra> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the user extras from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of user extras.
	 *
	 * @return the number of user extras
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UserExtraPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UserExtraPersistence, UserExtraPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UserExtraPersistence.class);

		ServiceTracker<UserExtraPersistence, UserExtraPersistence>
			serviceTracker =
				new ServiceTracker<UserExtraPersistence, UserExtraPersistence>(
					bundle.getBundleContext(), UserExtraPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}