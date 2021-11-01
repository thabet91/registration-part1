
package amf.search.portlet.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import amf.search.constants.AmfSearchPortletKeys;
import amf.search.constants.MVCCommandNames;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + AmfSearchPortletKeys.AMFSEARCH,
	        "mvc.command.name=" + MVCCommandNames.SEARCH
	    },
	    service = MVCActionCommand.class
	)
public class SearchMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		String searchInput = ParamUtil.getString(actionRequest, "searchInput");
		System.out.println(searchInput);
		actionResponse.getRenderParameters().setValue("searchInput", searchInput);		
	}

}
