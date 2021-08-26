package com.liferay.amf.portlet.action;

import com.liferay.amf.constants.AmfRegistrationPortletKeys;
import com.liferay.amf.constants.MVCCommandNames;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + AmfRegistrationPortletKeys.AMFREGISTRATION,
		"mvc.command.name=" + MVCCommandNames.GO_TO_REGISTRATION }, service = MVCRenderCommand.class)
public class RegistrationPageRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		return "/registration/registration.jsp";
	}

}
