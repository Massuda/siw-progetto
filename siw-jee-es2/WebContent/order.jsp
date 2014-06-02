<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>order</title>
</head>
<body>
	<f:view>
		<h1>${orderController.order.id}</h1>
		<h2>Details</h2>
		<div>cust name: ${orderController.customer.firstName}</div>
	
	<div>
		<a href='<c:url value="/faces/customerHome.jsp" />'>home</a>
	</div>
	<h:form>
		<li><h:commandLink action="#{productController.viewProducts}"
				value="View products' catalogue" /></li>
	</h:form>
</f:view>
</body>
</html>