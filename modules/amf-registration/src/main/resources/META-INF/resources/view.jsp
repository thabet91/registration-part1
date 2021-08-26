<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@ include file="./init.jsp" %>
<% User currentUser = (User) request.getAttribute(WebKeys.USER); %>

 <liferay-ui:success key="RegistrationSuccess" message="Registration successful" />
<c:choose>
<c:when test="${empty currentUser}">
 <portlet:renderURL var="goToRegistrationPage">
     <portlet:param name="mvcRenderCommandName" value="<%=MVCCommandNames.GO_TO_REGISTRATION %>" />
     <portlet:param name="redirect" value="${currentURL}" />
 </portlet:renderURL>

<aui:form action="${goToRegistrationPage}" name="fm"><aui:button cssClass="btn btn-secondary" type="submit" value="Register" /></aui:form>
</c:when>
</c:choose>