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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.lifray.amf.exception.NoSuchUserExtraException;
import com.lifray.amf.model.UserExtra;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the user extra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserExtraUtil
 * @generated
 */
@ProviderType
public interface UserExtraPersistence extends BasePersistence<UserExtra> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserExtraUtil} to access the user extra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user extras where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user extras
	 */
	public java.util.List<UserExtra> findByUuid(String uuid);

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
	public java.util.List<UserExtra> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<UserExtra> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator);

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
	public java.util.List<UserExtra> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	public UserExtra findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
				orderByComparator)
		throws NoSuchUserExtraException;

	/**
	 * Returns the first user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	public UserExtra fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator);

	/**
	 * Returns the last user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	public UserExtra findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
				orderByComparator)
		throws NoSuchUserExtraException;

	/**
	 * Returns the last user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	public UserExtra fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator);

	/**
	 * Returns the user extras before and after the current user extra in the ordered set where uuid = &#63;.
	 *
	 * @param username the primary key of the current user extra
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user extra
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	public UserExtra[] findByUuid_PrevAndNext(
			String username, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
				orderByComparator)
		throws NoSuchUserExtraException;

	/**
	 * Removes all the user extras where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of user extras where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user extras
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the user extras where username = &#63;.
	 *
	 * @param username the username
	 * @return the matching user extras
	 */
	public java.util.List<UserExtra> findByUsername(String username);

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
	public java.util.List<UserExtra> findByUsername(
		String username, int start, int end);

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
	public java.util.List<UserExtra> findByUsername(
		String username, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator);

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
	public java.util.List<UserExtra> findByUsername(
		String username, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	public UserExtra findByUsername_First(
			String username,
			com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
				orderByComparator)
		throws NoSuchUserExtraException;

	/**
	 * Returns the first user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	public UserExtra fetchByUsername_First(
		String username,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator);

	/**
	 * Returns the last user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	public UserExtra findByUsername_Last(
			String username,
			com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
				orderByComparator)
		throws NoSuchUserExtraException;

	/**
	 * Returns the last user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	public UserExtra fetchByUsername_Last(
		String username,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator);

	/**
	 * Removes all the user extras where username = &#63; from the database.
	 *
	 * @param username the username
	 */
	public void removeByUsername(String username);

	/**
	 * Returns the number of user extras where username = &#63;.
	 *
	 * @param username the username
	 * @return the number of matching user extras
	 */
	public int countByUsername(String username);

	/**
	 * Caches the user extra in the entity cache if it is enabled.
	 *
	 * @param userExtra the user extra
	 */
	public void cacheResult(UserExtra userExtra);

	/**
	 * Caches the user extras in the entity cache if it is enabled.
	 *
	 * @param userExtras the user extras
	 */
	public void cacheResult(java.util.List<UserExtra> userExtras);

	/**
	 * Creates a new user extra with the primary key. Does not add the user extra to the database.
	 *
	 * @param username the primary key for the new user extra
	 * @return the new user extra
	 */
	public UserExtra create(String username);

	/**
	 * Removes the user extra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra that was removed
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	public UserExtra remove(String username) throws NoSuchUserExtraException;

	public UserExtra updateImpl(UserExtra userExtra);

	/**
	 * Returns the user extra with the primary key or throws a <code>NoSuchUserExtraException</code> if it could not be found.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	public UserExtra findByPrimaryKey(String username)
		throws NoSuchUserExtraException;

	/**
	 * Returns the user extra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra, or <code>null</code> if a user extra with the primary key could not be found
	 */
	public UserExtra fetchByPrimaryKey(String username);

	/**
	 * Returns all the user extras.
	 *
	 * @return the user extras
	 */
	public java.util.List<UserExtra> findAll();

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
	public java.util.List<UserExtra> findAll(int start, int end);

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
	public java.util.List<UserExtra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator);

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
	public java.util.List<UserExtra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserExtra>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user extras from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user extras.
	 *
	 * @return the number of user extras
	 */
	public int countAll();

}