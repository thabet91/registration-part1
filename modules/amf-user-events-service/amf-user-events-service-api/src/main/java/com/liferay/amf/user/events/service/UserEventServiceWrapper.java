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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserEventService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserEventService
 * @generated
 */
public class UserEventServiceWrapper
	implements ServiceWrapper<UserEventService>, UserEventService {

	public UserEventServiceWrapper(UserEventService userEventService) {
		_userEventService = userEventService;
	}

	@Override
	public com.liferay.amf.user.events.model.UserEvent addUserEvent(
			String username, long userId, String userIP, int eventType)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventService.addUserEvent(
			username, userId, userIP, eventType);
	}

	@Override
	public java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getAllEvents() {

		return _userEventService.getAllEvents();
	}

	@Override
	public java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getEventsByEventType(int eventType) {

		return _userEventService.getEventsByEventType(eventType);
	}

	@Override
	public java.util.List<com.liferay.amf.user.events.model.UserEvent>
		getEventsByUserId(long userId) {

		return _userEventService.getEventsByUserId(userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userEventService.getOSGiServiceIdentifier();
	}

	@Override
	public UserEventService getWrappedService() {
		return _userEventService;
	}

	@Override
	public void setWrappedService(UserEventService userEventService) {
		_userEventService = userEventService;
	}

	private UserEventService _userEventService;

}