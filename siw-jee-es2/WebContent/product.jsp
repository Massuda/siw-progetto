<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Product</title>
</head>
<body>
	<f:view>
		<h1>${productController.product.name}</h1>
		<h2>Details</h2>
		<div>Code: ${productController.product.code}</div>
		<div>Price: ${productController.product.price}</div>
		<div>Description: ${productController.product.description}</div>
	
	<div>
		<li><a href='<c:url value="/faces/index.jsp" />'>Index</a></li> 
	</div>
	<h:form>
		<li><h:commandLink action="#{productController.viewProducts}"
				value="View products' catalogue" /></li>
	</h:form>
</f:view>
</body>
</html>