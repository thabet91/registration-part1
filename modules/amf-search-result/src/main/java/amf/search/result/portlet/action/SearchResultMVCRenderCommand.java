package amf.search.result.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.AddressService;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import amf.search.result.constants.AmfSearchResultPortletKeys;
import amf.search.result.constants.MVCCommandNames;

@Component(
	    immediate = true, 
	    property = {
	        "javax.portlet.name=" + AmfSearchResultPortletKeys.AMFSEARCHRESULT, 
	        "mvc.command.name=/",
	        "mvc.command.name=" + MVCCommandNames.VIEW_SEARCH_RESULTS
	    }, 
	    service = MVCRenderCommand.class
	)
public class SearchResultMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String searchInput = ParamUtil.getString(renderRequest, "searchInput");
		
		return null;
	}

	@Reference
	protected AddressService _addressService;
}
