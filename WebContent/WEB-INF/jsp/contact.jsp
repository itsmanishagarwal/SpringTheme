<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
	<title>Spring 3 MVC Series - Contact Manager</title>
<link rel="stylesheet" type="text/css" media="all" href="<%= request.getContextPath() %>/wro/all.css"/>
</head>
<body>
<script type="text/javascript" src="<%=request.getContextPath() %>/wro/all.js"></script>


<form:form method="post" action="addContact.html">
	<table>
	<tr>
		<td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
		<td><form:input path="firstname" /></td> 
	</tr>
	<tr>
		<td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
		<td><form:input path="lastname" /></td>
	</tr>
	<tr>
		<td><form:label path="lastname"><spring:message code="label.email"/></form:label></td>
		<td><form:input path="email" /></td>
	</tr>
	<tr>
		<td><form:label path="lastname"><spring:message code="label.telephone"/></form:label></td>
		<td><form:input path="telephone" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.addcontact"/>"/>
		</td>
	</tr>
</table>	
	
</form:form>
        <c:set var="val" value="200.51" />
        <c:set var="minFractionDigits" value="2" />
        <c:set var="date" value="02/02/2011" />
        <fmt:setLocale value="en_US"/>
        <fmt:formatNumber value="200.51" type="currency" currencyCode="USD"  currencySymbol="$"/>
        <fmt:formatNumber currencyCode="USD" type="currency" value="4433122199.000"/>
        <br>
        <fmt:setLocale value="ja_JP"/>
        <fmt:formatNumber currencyCode="JPY" value="4433122199.69090"/>
        <br>
        JPY: <fmt:formatNumber pattern="###,###.##;(###,###.##)" value="-0.00001" minFractionDigits="2"/>
        <br>
        <c:out value="${fn:substring(date, 1, -1)}" />
    
        <fmt:formatNumber value="${fn:substring(date, 0, 2)}" minFractionDigits="${minFractionDigits}"/>
        <br>
            <c:out value="${fn:toLowerCase(name)}" />
</body>
</html>
