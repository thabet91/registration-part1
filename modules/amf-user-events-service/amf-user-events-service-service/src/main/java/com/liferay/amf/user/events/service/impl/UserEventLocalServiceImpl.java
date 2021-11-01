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
import com.liferay.amf.user.events.service.base.UserEventLocalServiceBaseImpl;
import com.liferay.amf.user.events.service.persistence.UserEventPersistence;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ResourceLocalService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the user event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.amf.user.events.service.UserEventLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEventLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.amf.user.events.model.UserEvent",
	service = AopService.class
)
public class UserEventLocalServiceImpl extends UserEventLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.amf.user.events.service.UserEventLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.amf.user.events.service.UserEventLocalServiceUtil</code>.
	 */
	@Reference
	protected CounterLocalService _counterService;
	
	@Reference
	protected UserEventPersistence eventPersistence;
	
	
	public UserEvent addUserEvent(String username, long userId, String userIP, int eventType) throws PortalException {
		long eventId = _counterService.increment(UserEvent.class.getName());
		UserEvent event = createUserEvent(eventId);
		event.setUserId(userId);
		event.setEventDate(new Date());
		event.setUserName(username);
		event.setEventType(eventType);
		event.setUserIP(userIP);
		resourceLocalService.addResources(0, 0, userId, UserEvent.class.getName(), eventId, false, false, false);
		return super.addUserEvent(event);
		
		
	
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