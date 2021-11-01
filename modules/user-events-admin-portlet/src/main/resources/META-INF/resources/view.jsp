<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="com.liferay.amf.user.events.service.UserEventServiceUtil"%>
<%@page import="com.liferay.amf.user.events.service.UserEventService"%>
<%@page import="com.liferay.amf.user.events.model.UserEvent"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.amf.user.events.service.UserEventLocalServiceUtil"%>
<%@page import="com.liferay.amf.user.events.admin.portlet.constants.MVCCommandNames"%>
<%@ include file="/init.jsp" %>

<liferay-ui:tabs names="All Events,Login events,Registration events" refresh="true">
    <liferay-ui:section>

         <%@ include file="events/all-events.jspf" %>
    </liferay-ui:section>
    <liferay-ui:section>
        <%@ include file="events/login-events.jspf" %>
    </liferay-ui:section>
    <liferay-ui:section>
		 <%@ include file="events/registration-events.jspf" %>
    </liferay-ui:section>
</liferay-ui:tabs>
