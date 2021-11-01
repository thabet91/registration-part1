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

package com.liferay.amf.user.events.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for UserEvent. This utility wraps
 * <code>com.liferay.amf.user.events.service.impl.UserEventServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see UserEventService
 * @generated
 */
public class UserEventServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.amf.user.events.service.impl.UserEventServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.amf.user.events.model.UserEvent addUserEvent(
			String username, long userId, String userIP, int eventType)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addUserEvent(username, userId, userIP, eventType);
	}

	public static java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getAllEvents() {

		return getService().getAllEvents();
	}

	public static java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getEventsByEventType(int eventType) {

		return getService().getEventsByEventType(eventType);
	}

	public static java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getEventsByUserId(long userId) {

		return getService().getEventsByUserId(userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static UserEventService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UserEventService, UserEventService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UserEventService.class);

		ServiceTracker<UserEventService, UserEventService> serviceTracker =
			new ServiceTracker<UserEventService, UserEventService>(
				bundle.getBundleContext(), UserEventService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}