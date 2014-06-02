<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Customer Home</title>
</head>
<body>
	<f:view>
		<h1>Welcome ${customerController.firstName}</h1>
		<ul><h:form>
			<li>
					<h:commandLink action="#{productController.listProducts}"
						value="List all Products" />
				</li>
				<li>
					<h:commandLink action="#{orderController.createOrder}"
						value="New Order" />
				</li>
					<li>
		<h:commandButton value="New Order"  action="#{orderController.createOrder}"/>
	</li>
			<li>
					<h:commandLink action="#{orderController.provaOrder}"
						value="vai a prova prende la passw" />
				</li>
				</h:form>
		</ul>
	</f:view>
</body>
</html>