package com.liferay.amf.login.events.post;

import com.liferay.amf.user.events.model.UserEvent;
import com.liferay.amf.user.events.service.UserEventService;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ferja
 */
@Component(
	immediate = true,
	property = {"key=login.events.post"
	},
	service = LifecycleAction.class
)
public class PostLoginEventListener implements LifecycleAction {
	
	@Reference
	protected UserService _userService;
	
	@Reference
	protected UserEventService _userEventService;
	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		try {
			User currentUser = _userService.getCurrentUser();
			UserEvent event =_userEventService.addUserEvent(currentUser.getScreenName(), currentUser.getUserId(), lifecycleEvent.getRequest().getRemoteAddr(), 0);
			System.out.println(event);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
