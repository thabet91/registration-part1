<%@page import="amf.search.constants.MVCCommandNames"%>
<%@ include file="/init.jsp" %>

<portlet:actionURL var="searchActionURL" name="<%=MVCCommandNames.SEARCH %>">
</portlet:actionURL>
<aui:form name="searchForm" action="${searchActionURL}" method ="POST">
<aui:input name="searchInput" label = "Search" type="text"/>
<aui:button name="Submit" type="submit"/>
</aui:form>