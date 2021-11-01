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

package com.liferay.amf.user.events.service.impl;

import com.liferay.amf.user.events.model.UserEvent;
import com.liferay.amf.user.events.service.UserEventLocalService;
import com.liferay.amf.user.events.service.base.UserEventServiceBaseImpl;
import com.liferay.amf.user.events.service.persistence.UserEventPersistence;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the user event remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.amf.user.events.service.UserEventService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEventServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=userevents",
		"json.web.service.context.path=UserEvent"
	},
	service = AopService.class
)
public class UserEventServiceImpl extends UserEventServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.amf.user.events.service.UserEventServiceUtil</code> to access the user event remote service.
	 */
	@Reference
	protected UserEventLocalService _userEventLocalService;
	
	@Reference
	protected UserEventPersistence eventPersistence;
	
	public UserEvent addUserEvent(String username, long userId, String userIP, int eventType) throws PortalException {
		return _userEventLocalService.addUserEvent(username, userId, userIP, eventType);
	}
	
	public List<UserEvent> getEventsByEventType(int eventType){
		return eventPersistence.findByeventType(eventType);
	}
	
	public List<UserEvent> getEventsByUserId(long userId){
		return eventPersistence.findByuserId(userId);
	}
	
	public List<UserEvent> getAllEvents(){
		return eventPersistence.findAll();
	}
}