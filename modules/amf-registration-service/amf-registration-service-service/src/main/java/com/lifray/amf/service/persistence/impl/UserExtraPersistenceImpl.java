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

package com.lifray.amf.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.lifray.amf.exception.NoSuchUserExtraException;
import com.lifray.amf.model.UserExtra;
import com.lifray.amf.model.impl.UserExtraImpl;
import com.lifray.amf.model.impl.UserExtraModelImpl;
import com.lifray.amf.service.persistence.UserExtraPersistence;
import com.lifray.amf.service.persistence.impl.constants.AMFPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the user extra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = UserExtraPersistence.class)
public class UserExtraPersistenceImpl
	extends BasePersistenceImpl<UserExtra> implements UserExtraPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>UserExtraUtil</code> to access the user extra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		UserExtraImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the user extras where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user extras
	 */
	@Override
	public List<UserExtra> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserExtra> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<UserExtra> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<UserExtra> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<UserExtra> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<UserExtra> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<UserExtra> list = null;

		if (useFinderCache) {
			list = (List<UserExtra>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UserExtra userExtra : list) {
					if (!uuid.equals(userExtra.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_USEREXTRA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(UserExtraModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<UserExtra>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	@Override
	public UserExtra findByUuid_First(
			String uuid, OrderByComparator<UserExtra> orderByComparator)
		throws NoSuchUserExtraException {

		UserExtra userExtra = fetchByUuid_First(uuid, orderByComparator);

		if (userExtra != null) {
			return userExtra;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchUserExtraException(sb.toString());
	}

	/**
	 * Returns the first user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	@Override
	public UserExtra fetchByUuid_First(
		String uuid, OrderByComparator<UserExtra> orderByComparator) {

		List<UserExtra> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	@Override
	public UserExtra findByUuid_Last(
			String uuid, OrderByComparator<UserExtra> orderByComparator)
		throws NoSuchUserExtraException {

		UserExtra userExtra = fetchByUuid_Last(uuid, orderByComparator);

		if (userExtra != null) {
			return userExtra;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchUserExtraException(sb.toString());
	}

	/**
	 * Returns the last user extra in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	@Override
	public UserExtra fetchByUuid_Last(
		String uuid, OrderByComparator<UserExtra> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<UserExtra> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserExtra[] findByUuid_PrevAndNext(
			String username, String uuid,
			OrderByComparator<UserExtra> orderByComparator)
		throws NoSuchUserExtraException {

		uuid = Objects.toString(uuid, "");

		UserExtra userExtra = findByPrimaryKey(username);

		Session session = null;

		try {
			session = openSession();

			UserExtra[] array = new UserExtraImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, userExtra, uuid, orderByComparator, true);

			array[1] = userExtra;

			array[2] = getByUuid_PrevAndNext(
				session, userExtra, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserExtra getByUuid_PrevAndNext(
		Session session, UserExtra userExtra, String uuid,
		OrderByComparator<UserExtra> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_USEREXTRA_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(UserExtraModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(userExtra)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<UserExtra> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user extras where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (UserExtra userExtra :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(userExtra);
		}
	}

	/**
	 * Returns the number of user extras where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user extras
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_USEREXTRA_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"userExtra.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(userExtra.uuid IS NULL OR userExtra.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByUsername;
	private FinderPath _finderPathWithoutPaginationFindByUsername;
	private FinderPath _finderPathCountByUsername;

	/**
	 * Returns all the user extras where username = &#63;.
	 *
	 * @param username the username
	 * @return the matching user extras
	 */
	@Override
	public List<UserExtra> findByUsername(String username) {
		return findByUsername(
			username, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserExtra> findByUsername(String username, int start, int end) {
		return findByUsername(username, start, end, null);
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
	@Override
	public List<UserExtra> findByUsername(
		String username, int start, int end,
		OrderByComparator<UserExtra> orderByComparator) {

		return findByUsername(username, start, end, orderByComparator, true);
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
	@Override
	public List<UserExtra> findByUsername(
		String username, int start, int end,
		OrderByComparator<UserExtra> orderByComparator,
		boolean useFinderCache) {

		username = Objects.toString(username, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUsername;
				finderArgs = new Object[] {username};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUsername;
			finderArgs = new Object[] {username, start, end, orderByComparator};
		}

		List<UserExtra> list = null;

		if (useFinderCache) {
			list = (List<UserExtra>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UserExtra userExtra : list) {
					if (!username.equals(userExtra.getUsername())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_USEREXTRA_WHERE);

			boolean bindUsername = false;

			if (username.isEmpty()) {
				sb.append(_FINDER_COLUMN_USERNAME_USERNAME_3);
			}
			else {
				bindUsername = true;

				sb.append(_FINDER_COLUMN_USERNAME_USERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(UserExtraModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUsername) {
					queryPos.add(username);
				}

				list = (List<UserExtra>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	@Override
	public UserExtra findByUsername_First(
			String username, OrderByComparator<UserExtra> orderByComparator)
		throws NoSuchUserExtraException {

		UserExtra userExtra = fetchByUsername_First(
			username, orderByComparator);

		if (userExtra != null) {
			return userExtra;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("username=");
		sb.append(username);

		sb.append("}");

		throw new NoSuchUserExtraException(sb.toString());
	}

	/**
	 * Returns the first user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	@Override
	public UserExtra fetchByUsername_First(
		String username, OrderByComparator<UserExtra> orderByComparator) {

		List<UserExtra> list = findByUsername(
			username, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra
	 * @throws NoSuchUserExtraException if a matching user extra could not be found
	 */
	@Override
	public UserExtra findByUsername_Last(
			String username, OrderByComparator<UserExtra> orderByComparator)
		throws NoSuchUserExtraException {

		UserExtra userExtra = fetchByUsername_Last(username, orderByComparator);

		if (userExtra != null) {
			return userExtra;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("username=");
		sb.append(username);

		sb.append("}");

		throw new NoSuchUserExtraException(sb.toString());
	}

	/**
	 * Returns the last user extra in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user extra, or <code>null</code> if a matching user extra could not be found
	 */
	@Override
	public UserExtra fetchByUsername_Last(
		String username, OrderByComparator<UserExtra> orderByComparator) {

		int count = countByUsername(username);

		if (count == 0) {
			return null;
		}

		List<UserExtra> list = findByUsername(
			username, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the user extras where username = &#63; from the database.
	 *
	 * @param username the username
	 */
	@Override
	public void removeByUsername(String username) {
		for (UserExtra userExtra :
				findByUsername(
					username, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(userExtra);
		}
	}

	/**
	 * Returns the number of user extras where username = &#63;.
	 *
	 * @param username the username
	 * @return the number of matching user extras
	 */
	@Override
	public int countByUsername(String username) {
		username = Objects.toString(username, "");

		FinderPath finderPath = _finderPathCountByUsername;

		Object[] finderArgs = new Object[] {username};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_USEREXTRA_WHERE);

			boolean bindUsername = false;

			if (username.isEmpty()) {
				sb.append(_FINDER_COLUMN_USERNAME_USERNAME_3);
			}
			else {
				bindUsername = true;

				sb.append(_FINDER_COLUMN_USERNAME_USERNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUsername) {
					queryPos.add(username);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERNAME_USERNAME_2 =
		"userExtra.username = ?";

	private static final String _FINDER_COLUMN_USERNAME_USERNAME_3 =
		"(userExtra.username IS NULL OR userExtra.username = '')";

	public UserExtraPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(UserExtra.class);

		setModelImplClass(UserExtraImpl.class);
		setModelPKClass(String.class);
	}

	/**
	 * Caches the user extra in the entity cache if it is enabled.
	 *
	 * @param userExtra the user extra
	 */
	@Override
	public void cacheResult(UserExtra userExtra) {
		entityCache.putResult(
			UserExtraImpl.class, userExtra.getPrimaryKey(), userExtra);

		userExtra.resetOriginalValues();
	}

	/**
	 * Caches the user extras in the entity cache if it is enabled.
	 *
	 * @param userExtras the user extras
	 */
	@Override
	public void cacheResult(List<UserExtra> userExtras) {
		for (UserExtra userExtra : userExtras) {
			if (entityCache.getResult(
					UserExtraImpl.class, userExtra.getPrimaryKey()) == null) {

				cacheResult(userExtra);
			}
			else {
				userExtra.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user extras.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UserExtraImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user extra.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserExtra userExtra) {
		entityCache.removeResult(
			UserExtraImpl.class, userExtra.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserExtra> userExtras) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserExtra userExtra : userExtras) {
			entityCache.removeResult(
				UserExtraImpl.class, userExtra.getPrimaryKey());
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(UserExtraImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new user extra with the primary key. Does not add the user extra to the database.
	 *
	 * @param username the primary key for the new user extra
	 * @return the new user extra
	 */
	@Override
	public UserExtra create(String username) {
		UserExtra userExtra = new UserExtraImpl();

		userExtra.setNew(true);
		userExtra.setPrimaryKey(username);

		String uuid = PortalUUIDUtil.generate();

		userExtra.setUuid(uuid);

		return userExtra;
	}

	/**
	 * Removes the user extra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra that was removed
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	@Override
	public UserExtra remove(String username) throws NoSuchUserExtraException {
		return remove((Serializable)username);
	}

	/**
	 * Removes the user extra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user extra
	 * @return the user extra that was removed
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	@Override
	public UserExtra remove(Serializable primaryKey)
		throws NoSuchUserExtraException {

		Session session = null;

		try {
			session = openSession();

			UserExtra userExtra = (UserExtra)session.get(
				UserExtraImpl.class, primaryKey);

			if (userExtra == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserExtraException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(userExtra);
		}
		catch (NoSuchUserExtraException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UserExtra removeImpl(UserExtra userExtra) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userExtra)) {
				userExtra = (UserExtra)session.get(
					UserExtraImpl.class, userExtra.getPrimaryKeyObj());
			}

			if (userExtra != null) {
				session.delete(userExtra);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (userExtra != null) {
			clearCache(userExtra);
		}

		return userExtra;
	}

	@Override
	public UserExtra updateImpl(UserExtra userExtra) {
		boolean isNew = userExtra.isNew();

		if (!(userExtra instanceof UserExtraModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(userExtra.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(userExtra);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in userExtra proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UserExtra implementation " +
					userExtra.getClass());
		}

		UserExtraModelImpl userExtraModelImpl = (UserExtraModelImpl)userExtra;

		if (Validator.isNull(userExtra.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			userExtra.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (userExtra.isNew()) {
				session.save(userExtra);

				userExtra.setNew(false);
			}
			else {
				userExtra = (UserExtra)session.merge(userExtra);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			Object[] args = new Object[] {userExtraModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {userExtraModelImpl.getUsername()};

			finderCache.removeResult(_finderPathCountByUsername, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUsername, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((userExtraModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					userExtraModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {userExtraModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((userExtraModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUsername.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					userExtraModelImpl.getOriginalUsername()
				};

				finderCache.removeResult(_finderPathCountByUsername, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUsername, args);

				args = new Object[] {userExtraModelImpl.getUsername()};

				finderCache.removeResult(_finderPathCountByUsername, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUsername, args);
			}
		}

		entityCache.putResult(
			UserExtraImpl.class, userExtra.getPrimaryKey(), userExtra, false);

		userExtra.resetOriginalValues();

		return userExtra;
	}

	/**
	 * Returns the user extra with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user extra
	 * @return the user extra
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	@Override
	public UserExtra findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserExtraException {

		UserExtra userExtra = fetchByPrimaryKey(primaryKey);

		if (userExtra == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserExtraException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return userExtra;
	}

	/**
	 * Returns the user extra with the primary key or throws a <code>NoSuchUserExtraException</code> if it could not be found.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra
	 * @throws NoSuchUserExtraException if a user extra with the primary key could not be found
	 */
	@Override
	public UserExtra findByPrimaryKey(String username)
		throws NoSuchUserExtraException {

		return findByPrimaryKey((Serializable)username);
	}

	/**
	 * Returns the user extra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param username the primary key of the user extra
	 * @return the user extra, or <code>null</code> if a user extra with the primary key could not be found
	 */
	@Override
	public UserExtra fetchByPrimaryKey(String username) {
		return fetchByPrimaryKey((Serializable)username);
	}

	/**
	 * Returns all the user extras.
	 *
	 * @return the user extras
	 */
	@Override
	public List<UserExtra> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserExtra> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<UserExtra> findAll(
		int start, int end, OrderByComparator<UserExtra> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<UserExtra> findAll(
		int start, int end, OrderByComparator<UserExtra> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<UserExtra> list = null;

		if (useFinderCache) {
			list = (List<UserExtra>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_USEREXTRA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_USEREXTRA;

				sql = sql.concat(UserExtraModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<UserExtra>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the user extras from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UserExtra userExtra : findAll()) {
			remove(userExtra);
		}
	}

	/**
	 * Returns the number of user extras.
	 *
	 * @return the number of user extras
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_USEREXTRA);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "username";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_USEREXTRA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UserExtraModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the user extra persistence.
	 */
	@Activate
	public void activate() {
		_finderPathWithPaginationFindAll = new FinderPath(
			UserExtraImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			UserExtraImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);

		_finderPathCountAll = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			UserExtraImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			UserExtraImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid", new String[] {String.class.getName()},
			UserExtraModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUuid", new String[] {String.class.getName()});

		_finderPathWithPaginationFindByUsername = new FinderPath(
			UserExtraImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUsername",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUsername = new FinderPath(
			UserExtraImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUsername", new String[] {String.class.getName()},
			UserExtraModelImpl.USERNAME_COLUMN_BITMASK);

		_finderPathCountByUsername = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUsername", new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(UserExtraImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = AMFPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AMFPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AMFPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_USEREXTRA =
		"SELECT userExtra FROM UserExtra userExtra";

	private static final String _SQL_SELECT_USEREXTRA_WHERE =
		"SELECT userExtra FROM UserExtra userExtra WHERE ";

	private static final String _SQL_COUNT_USEREXTRA =
		"SELECT COUNT(userExtra) FROM UserExtra userExtra";

	private static final String _SQL_COUNT_USEREXTRA_WHERE =
		"SELECT COUNT(userExtra) FROM UserExtra userExtra WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "userExtra.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No UserExtra exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No UserExtra exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		UserExtraPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	static {
		try {
			Class.forName(AMFPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}