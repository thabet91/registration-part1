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

package com.liferay.amf.user.events.service.persistence;

import com.liferay.amf.user.events.exception.NoSuchUserEventException;
import com.liferay.amf.user.events.model.UserEvent;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the user event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEventUtil
 * @generated
 */
@ProviderType
public interface UserEventPersistence extends BasePersistence<UserEvent> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserEventUtil} to access the user event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user events
	 */
	public java.util.List<UserEvent> findByUuid(String uuid);

	/**
	 * Returns a range of all the user events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @return the range of matching user events
	 */
	public java.util.List<UserEvent> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the user events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user events
	 */
	public java.util.List<UserEvent> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user events
	 */
	public java.util.List<UserEvent> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns the first user event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the last user event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns the last user event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the user events before and after the current user event in the ordered set where uuid = &#63;.
	 *
	 * @param userEventId the primary key of the current user event
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user event
	 * @throws NoSuchUserEventException if a user event with the primary key could not be found
	 */
	public UserEvent[] findByUuid_PrevAndNext(
			long userEventId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Removes all the user events where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of user events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user events
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the user event where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchUserEventException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByUUID_G(String uuid, long groupId)
		throws NoSuchUserEventException;

	/**
	 * Returns the user event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the user event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the user event where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the user event that was removed
	 */
	public UserEvent removeByUUID_G(String uuid, long groupId)
		throws NoSuchUserEventException;

	/**
	 * Returns the number of user events where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching user events
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the user events where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching user events
	 */
	public java.util.List<UserEvent> findByGroupId(long groupId);

	/**
	 * Returns a range of all the user events where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @return the range of matching user events
	 */
	public java.util.List<UserEvent> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the user events where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user events
	 */
	public java.util.List<UserEvent> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user events where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user events
	 */
	public java.util.List<UserEvent> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user event in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns the first user event in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the last user event in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns the last user event in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the user events before and after the current user event in the ordered set where groupId = &#63;.
	 *
	 * @param userEventId the primary key of the current user event
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user event
	 * @throws NoSuchUserEventException if a user event with the primary key could not be found
	 */
	public UserEvent[] findByGroupId_PrevAndNext(
			long userEventId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns all the user events that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching user events that the user has permission to view
	 */
	public java.util.List<UserEvent> filterFindByGroupId(long groupId);

	/**
	 * Returns a range of all the user events that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @return the range of matching user events that the user has permission to view
	 */
	public java.util.List<UserEvent> filterFindByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the user events that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user events that the user has permission to view
	 */
	public java.util.List<UserEvent> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the user events before and after the current user event in the ordered set of user events that the user has permission to view where groupId = &#63;.
	 *
	 * @param userEventId the primary key of the current user event
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user event
	 * @throws NoSuchUserEventException if a user event with the primary key could not be found
	 */
	public UserEvent[] filterFindByGroupId_PrevAndNext(
			long userEventId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Removes all the user events where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of user events where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching user events
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of user events that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching user events that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the user events where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the matching user events
	 */
	public java.util.List<UserEvent> findByeventType(int eventType);

	/**
	 * Returns a range of all the user events where eventType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @return the range of matching user events
	 */
	public java.util.List<UserEvent> findByeventType(
		int eventType, int start, int end);

	/**
	 * Returns an ordered range of all the user events where eventType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user events
	 */
	public java.util.List<UserEvent> findByeventType(
		int eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user events where eventType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user events
	 */
	public java.util.List<UserEvent> findByeventType(
		int eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user event in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByeventType_First(
			int eventType,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns the first user event in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByeventType_First(
		int eventType,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the last user event in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByeventType_Last(
			int eventType,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns the last user event in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByeventType_Last(
		int eventType,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the user events before and after the current user event in the ordered set where eventType = &#63;.
	 *
	 * @param userEventId the primary key of the current user event
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user event
	 * @throws NoSuchUserEventException if a user event with the primary key could not be found
	 */
	public UserEvent[] findByeventType_PrevAndNext(
			long userEventId, int eventType,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Removes all the user events where eventType = &#63; from the database.
	 *
	 * @param eventType the event type
	 */
	public void removeByeventType(int eventType);

	/**
	 * Returns the number of user events where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the number of matching user events
	 */
	public int countByeventType(int eventType);

	/**
	 * Returns all the user events where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user events
	 */
	public java.util.List<UserEvent> findByuserId(long userId);

	/**
	 * Returns a range of all the user events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @return the range of matching user events
	 */
	public java.util.List<UserEvent> findByuserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the user events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user events
	 */
	public java.util.List<UserEvent> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user events
	 */
	public java.util.List<UserEvent> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByuserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns the first user event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByuserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the last user event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user event
	 * @throws NoSuchUserEventException if a matching user event could not be found
	 */
	public UserEvent findByuserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Returns the last user event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public UserEvent fetchByuserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns the user events before and after the current user event in the ordered set where userId = &#63;.
	 *
	 * @param userEventId the primary key of the current user event
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user event
	 * @throws NoSuchUserEventException if a user event with the primary key could not be found
	 */
	public UserEvent[] findByuserId_PrevAndNext(
			long userEventId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
				orderByComparator)
		throws NoSuchUserEventException;

	/**
	 * Removes all the user events where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByuserId(long userId);

	/**
	 * Returns the number of user events where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user events
	 */
	public int countByuserId(long userId);

	/**
	 * Caches the user event in the entity cache if it is enabled.
	 *
	 * @param userEvent the user event
	 */
	public void cacheResult(UserEvent userEvent);

	/**
	 * Caches the user events in the entity cache if it is enabled.
	 *
	 * @param userEvents the user events
	 */
	public void cacheResult(java.util.List<UserEvent> userEvents);

	/**
	 * Creates a new user event with the primary key. Does not add the user event to the database.
	 *
	 * @param userEventId the primary key for the new user event
	 * @return the new user event
	 */
	public UserEvent create(long userEventId);

	/**
	 * Removes the user event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userEventId the primary key of the user event
	 * @return the user event that was removed
	 * @throws NoSuchUserEventException if a user event with the primary key could not be found
	 */
	public UserEvent remove(long userEventId) throws NoSuchUserEventException;

	public UserEvent updateImpl(UserEvent userEvent);

	/**
	 * Returns the user event with the primary key or throws a <code>NoSuchUserEventException</code> if it could not be found.
	 *
	 * @param userEventId the primary key of the user event
	 * @return the user event
	 * @throws NoSuchUserEventException if a user event with the primary key could not be found
	 */
	public UserEvent findByPrimaryKey(long userEventId)
		throws NoSuchUserEventException;

	/**
	 * Returns the user event with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userEventId the primary key of the user event
	 * @return the user event, or <code>null</code> if a user event with the primary key could not be found
	 */
	public UserEvent fetchByPrimaryKey(long userEventId);

	/**
	 * Returns all the user events.
	 *
	 * @return the user events
	 */
	public java.util.List<UserEvent> findAll();

	/**
	 * Returns a range of all the user events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @return the range of user events
	 */
	public java.util.List<UserEvent> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the user events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user events
	 */
	public java.util.List<UserEvent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user events
	 */
	public java.util.List<UserEvent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user events from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user events.
	 *
	 * @return the number of user events
	 */
	public int countAll();

}