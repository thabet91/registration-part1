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

package com.lifray.amf.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.lifray.amf.model.UserExtra;
import com.lifray.amf.service.base.UserExtraLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the user extra local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.lifray.amf.service.UserExtraLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserExtraLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.lifray.amf.model.UserExtra", service = AopService.class)
public class UserExtraLocalServiceImpl extends UserExtraLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.lifray.amf.service.UserExtraLocalService</code> via injection or a
	 * <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.lifray.amf.service.UserExtraLocalServiceUtil</code>.
	 */
	public UserExtra addUserExtras(String username,long userId, long mobilePhone, long homePhone, String securityQuestion,
			String securityAnswer) throws PortalException {
		
		UserExtra userExtra = createUserExtra(username);
		userExtra.setUserId(userId);
		userExtra.setMobilePhone(mobilePhone);
		userExtra.setHomePhone(homePhone);
		userExtra.setSecurityQuestion(securityQuestion);
		userExtra.setSecurityQuestionAnswer(securityAnswer);
		return super.addUserExtra(userExtra);
		
	}

//	@Reference
//	protected UserLocalService userLocalService;

	@Override
	public UserExtra addUserExtras(String username, long mobilePhone, long homePhone, String securityQuestion,
			String securityAnswer, ServiceContext serviceContext) throws PortalException {
		throw new UnsupportedOperationException("Not supported.");
	}
}