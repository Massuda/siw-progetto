<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>siw-jee-es2</title>
</head>
<body>
	<f:view>
		<h1>Welcome!</h1>
		<ul>
			
				<li><a href='<c:url value="/faces/newCustomer.jsp" />'>Registration</a></li>
				<li><a href='<c:url value="/faces/customerLogin.jsp" />'>Login User</a></li>
				<li><a href='<c:url value="/faces/administratorLogin.jsp" />'>Login Administrator</a></li>
				<h:form>
				<li><h:commandLink action="#{productController.viewProducts}" value="View products' catalogue" /></li>
				</h:form>
		</ul>
	</f:view>
</body>
</html>

