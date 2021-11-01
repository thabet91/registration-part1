package com.liferay.amf.user.events.internal.security.permission.resource.definition;

import com.liferay.amf.user.events.constants.AmfConstants;
import com.liferay.amf.user.events.model.UserEvent;
import com.liferay.amf.user.events.service.UserEventLocalService;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;
import com.liferay.portal.kernel.security.permission.resource.definition.ModelResourcePermissionDefinition;

import java.util.function.Consumer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	     immediate = true, 
	     service = ModelResourcePermissionDefinition.class
	 )
public class UserEventModelResourcePermissionDefinition implements ModelResourcePermissionDefinition<UserEvent>{

	@Override
	public UserEvent getModel(long primaryKey) throws PortalException {
		return _userEventLocalService.getUserEvent(primaryKey);
	}

	@Override
	public Class<UserEvent> getModelClass() {
		return UserEvent.class;
	}

	@Override
	public PortletResourcePermission getPortletResourcePermission() {
		return _portletResourcePermission;
	}

	@Override
	public long getPrimaryKey(UserEvent t) {
		return t.getUserEventId();
	}

	@Override
	public void registerModelResourcePermissionLogics(ModelResourcePermission<UserEvent> modelResourcePermission,
			Consumer<ModelResourcePermissionLogic<UserEvent>> modelResourcePermissionLogicConsumer) {
		  modelResourcePermissionLogicConsumer.accept(
		             new StagedModelPermissionLogic<>(
		                 _stagingPermission,
		                 "com_liferay_training_gradebook_web_portlet_GradebookPortlet",
		                 UserEvent::getUserEventId));
		
	}
	

    @Reference
    private UserEventLocalService _userEventLocalService;

    @Reference
    private GroupLocalService _groupLocalService;

    @Reference(target = "(resource.name=" + AmfConstants.RESOURCE_NAME + ")")
    private PortletResourcePermission _portletResourcePermission;

    @Reference
    private StagingPermission _stagingPermission;

    @Reference
    private WorkflowPermission _workflowPermission;

}
