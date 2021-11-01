package com.liferay.amf.model.listener;

import com.liferay.amf.user.events.model.UserEvent;
import com.liferay.amf.user.events.service.UserEventService;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ferja
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = ModelListener.class
)
public class UserPostCreateModelListener extends BaseModelListener<User> {
	
	@Reference
	protected UserEventService _userEventService;

	@Override
	public void onAfterCreate(User model) throws ModelListenerException {
		try {
			_userEventService.addUserEvent(model.getScreenName(), model.getUserId(), "0.0.0.0", 1);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		
		super.onAfterCreate(model);
	}


}