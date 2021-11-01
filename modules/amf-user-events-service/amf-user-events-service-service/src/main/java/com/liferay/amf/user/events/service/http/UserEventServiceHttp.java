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

package com.liferay.amf.user.events.service.http;

import com.liferay.amf.user.events.service.UserEventServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>UserEventServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEventServiceSoap
 * @generated
 */
public class UserEventServiceHttp {

	public static com.liferay.amf.user.events.model.UserEvent addUserEvent(
			HttpPrincipal httpPrincipal, String username, long userId,
			String userIP, int eventType)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				UserEventServiceUtil.class, "addUserEvent",
				_addUserEventParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, username, userId, userIP, eventType);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.amf.user.events.model.UserEvent)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getEventsByEventType(HttpPrincipal httpPrincipal, int eventType) {

		try {
			MethodKey methodKey = new MethodKey(
				UserEventServiceUtil.class, "getEventsByEventType",
				_getEventsByEventTypeParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, eventType);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.amf.user.events.model.UserEvent>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getEventsByUserId(HttpPrincipal httpPrincipal, long userId) {

		try {
			MethodKey methodKey = new MethodKey(
				UserEventServiceUtil.class, "getEventsByUserId",
				_getEventsByUserIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.amf.user.events.model.UserEvent>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getAllEvents(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				UserEventServiceUtil.class, "getAllEvents",
				_getAllEventsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.amf.user.events.model.UserEvent>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(UserEventServiceHttp.class);

	private static final Class<?>[] _addUserEventParameterTypes0 = new Class[] {
		String.class, long.class, String.class, int.class
	};
	private static final Class<?>[] _getEventsByEventTypeParameterTypes1 =
		new Class[] {int.class};
	private static final Class<?>[] _getEventsByUserIdParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getAllEventsParameterTypes3 =
		new Class[] {};

}