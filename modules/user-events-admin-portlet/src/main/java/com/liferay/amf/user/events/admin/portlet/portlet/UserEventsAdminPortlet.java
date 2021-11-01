package com.liferay.amf.user.events.admin.portlet.portlet;

import com.liferay.amf.user.events.admin.portlet.constants.UserEventsAdminPortletKeys;
import com.liferay.amf.user.events.model.UserEvent;
import com.liferay.amf.user.events.service.UserEventLocalService;
import com.liferay.amf.user.events.service.UserEventService;
import com.liferay.amf.user.events.service.UserEventServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ferja
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=UserEventsAdmin",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UserEventsAdminPortletKeys.USEREVENTSADMIN,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UserEventsAdminPortlet extends MVCPortlet {
	
}