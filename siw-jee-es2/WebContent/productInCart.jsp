<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
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
		<div>ID: ${productController.product.id}</div>
	<h:form>
	<div>Quantity: <h:inputText value="#{orderLineController.quantity}" 
                     required="true"
                     requiredMessage="Quantity is mandatory"
                     id="quantity"/> <h:message for="quantity" />
	</div>
	<div>
		<h:commandButton value="Submit" action="#{orderLineController.createOrderLine}" />
	</div>
	</h:form>
	</f:view>
</body>
</html>