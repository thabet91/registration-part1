package com.liferay.amf.user.events.admin.portlet.actions;

import com.liferay.amf.user.events.admin.portlet.constants.UserEventsAdminPortletKeys;
import com.liferay.amf.user.events.admin.portlet.dto.UserEventsDTO;
import com.liferay.amf.user.events.model.UserEvent;
import com.liferay.amf.user.events.service.UserEventLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
	    immediate = true, 
	    property = {
	        "javax.portlet.name=" + UserEventsAdminPortletKeys.USEREVENTSADMIN, 
	        "mvc.command.name=/"
	    }, 
	    service = MVCRenderCommand.class
	)
public class ViewAllEventsMVCRenderCommand implements MVCRenderCommand {

	@Reference
	protected UserEventLocalService userEventService;
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		List<UserEvent> allEvents = userEventService.getAllEvents();
		List<UserEvent> loginEvents = userEventService.getEventsByEventType(0);
		List<UserEvent> registrationEvents = userEventService.getEventsByEventType(1);
		renderRequest.setAttribute("allEvents", prepareAllEventsDTOList(allEvents));
		renderRequest.setAttribute("loginEvents", prepareAllEventsDTOList(loginEvents));
		renderRequest.setAttribute("registrationEvents", prepareAllEventsDTOList(registrationEvents));
		renderRequest.setAttribute("eventsCount", allEvents.size());
		renderRequest.setAttribute("loginEventsCount", loginEvents.size());
		renderRequest.setAttribute("registrationEventsCount", registrationEvents.size());
		

		return "/view.jsp";
	}
    private List<UserEventsDTO> prepareAllEventsDTOList(List<UserEvent> userEvents){
    	List<UserEventsDTO> userEventsDTOs = new ArrayList<UserEventsDTO>();
    	for(UserEvent event : userEvents) {
    		userEventsDTOs.add(new UserEventsDTO(event));
    	}
    	return userEventsDTOs;
    }
}
