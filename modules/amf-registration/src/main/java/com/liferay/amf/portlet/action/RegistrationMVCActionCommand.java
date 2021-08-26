package com.liferay.amf.portlet.action;

import com.liferay.amf.constants.AmfRegistrationPortletKeys;
import com.liferay.amf.constants.FieldConstants;
import com.liferay.amf.constants.MVCCommandNames;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.AddressLocalServiceWrapper;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.lifray.amf.exception.UserExtraValidationException;
import com.lifray.amf.service.UserExtraLocalService;
import com.lifray.amf.util.validator.UserValidatorImpl;
import com.lifray.amf.validator.UserValidator;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + AmfRegistrationPortletKeys.AMFREGISTRATION,
		"mvc.command.name=" + MVCCommandNames.REGISTRATION,"service.ranking:Integer=100"  }, service = MVCActionCommand.class)
public class RegistrationMVCActionCommand extends BaseMVCActionCommand {

	@Reference
	protected UserLocalService _userService;
	@Reference
	protected AddressLocalServiceWrapper addressLocalServiceWrapper;
	@Reference
	protected UserExtraLocalService userExtraLocalService;
	
	@Reference
	protected UserValidatorImpl validator;

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("tessssssssssssst");
		try {
		validateUser(actionRequest);
		User newUser = addToUserTable(actionRequest);
		addUserAddresse(actionRequest, newUser.getUserId());
		insertUserExtraInfo(actionRequest, newUser.getUserId());
		SessionMessages.add(actionRequest, "RegistrationSuccess");
		}catch (UserExtraValidationException e){
            e.getErrors().forEach(key -> SessionErrors.add(actionRequest, key));

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandNames.REGISTRATION);
		}
	}

	private void addUserAddresse(ActionRequest actionRequest, long userId) throws PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Address.class.getName(), actionRequest);
		addressLocalServiceWrapper.addAddress(userId, Address.class.getName(),
				PortalUtil.getClassNameId(Address.class.getName()),
				ParamUtil.getString(actionRequest, FieldConstants.ADDRESS_1),
				ParamUtil.getString(actionRequest, FieldConstants.ADDRESS_2), "",
				ParamUtil.getString(actionRequest, FieldConstants.CITY),
				ParamUtil.getString(actionRequest, FieldConstants.ZIP_CODE), 0, 0, 0, true, false, serviceContext);
	}

	private User addToUserTable(ActionRequest actionRequest) throws PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(User.class.getName(), actionRequest);
		return _userService.addUser(new Long(0).longValue(), new Long(0).longValue(), false,
				ParamUtil.getString(actionRequest, FieldConstants.PASSWORD),
				ParamUtil.getString(actionRequest, FieldConstants.PASSWORD_CONFIRMATION), true,
				ParamUtil.getString(actionRequest, FieldConstants.FIRSTNAME) + " "
						+ ParamUtil.getString(actionRequest, FieldConstants.LASTNAME),
				ParamUtil.getString(actionRequest, FieldConstants.EMAIL_ADDRESS), new Long(0).longValue(), "", null,
				ParamUtil.getString(actionRequest, FieldConstants.FIRSTNAME), "",
				ParamUtil.getString(actionRequest, FieldConstants.LASTNAME), new Long(0).longValue(),
				new Long(0).longValue(), ParamUtil.getBoolean(actionRequest, FieldConstants.MALE),
				ParamUtil.getInteger(actionRequest, FieldConstants.BIRT_MONTH),
				ParamUtil.getInteger(actionRequest, FieldConstants.BIRTH_DAY),
				ParamUtil.getInteger(actionRequest, FieldConstants.BIRTH_YEAR), "", new long[0], new long[0],
				new long[0], new long[0], true, serviceContext);
	}

	private void insertUserExtraInfo(ActionRequest actionRequest, long userId) throws PortalException {
		userExtraLocalService.addUserExtras(ParamUtil.getString(actionRequest, FieldConstants.USERNAME), userId,
				ParamUtil.getLong(actionRequest, FieldConstants.MOBILE_PHONE),
				ParamUtil.getLong(actionRequest, FieldConstants.HOME_PHONE),
				ParamUtil.getString(actionRequest, FieldConstants.SECURITY_QUESTION),
				ParamUtil.getString(actionRequest, FieldConstants.SECURITY_QUESTION_ANSWER));
	}
	
	private void validateUser(ActionRequest actionRequest) throws UserExtraValidationException, ParseException {
		String birthdate = ParamUtil.getString(actionRequest, FieldConstants.BIRTH_DAY)+"/"
				+ParamUtil.getString(actionRequest, FieldConstants.BIRT_MONTH)+"/"
				+ParamUtil.getString(actionRequest, FieldConstants.BIRTH_YEAR);
		
		validator.validate(ParamUtil.getString(actionRequest, FieldConstants.FIRSTNAME),
				ParamUtil.getString(actionRequest, FieldConstants.LASTNAME),
				ParamUtil.getString(actionRequest, FieldConstants.USERNAME),
				ParamUtil.getString(actionRequest, FieldConstants.PASSWORD),
				ParamUtil.getString(actionRequest, FieldConstants.PASSWORD_CONFIRMATION),
				new SimpleDateFormat("dd/MM/yyyy").parse(birthdate),
				ParamUtil.getString(actionRequest, FieldConstants.EMAIL_ADDRESS),
				ParamUtil.getLong(actionRequest, FieldConstants.HOME_PHONE),
				ParamUtil.getLong(actionRequest, FieldConstants.MOBILE_PHONE),
				ParamUtil.getString(actionRequest, FieldConstants.ADDRESS_1),
				ParamUtil.getString(actionRequest, FieldConstants.ADDRESS_2),
				ParamUtil.getString(actionRequest, FieldConstants.CITY),
				ParamUtil.getString(actionRequest, FieldConstants.STATE),
				ParamUtil.getInteger(actionRequest, FieldConstants.ZIP_CODE), 
				ParamUtil.getString(actionRequest, FieldConstants.SECURITY_QUESTION_ANSWER),
				ParamUtil.getBoolean(actionRequest, FieldConstants.TERMS_OF_USE));
	}

}
