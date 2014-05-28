<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Find Product</title>
</head>
<body>
<f:view>
<h:form>
    <div>Name: <h:inputText value="#{productController.name}" 
                     required="true"
                     requiredMessage="Name is mandatory"
                     id="name"/> <h:message for="name" />
	</div>
	<div>
		<h:commandButton value="Submit"  action="#{productController.findByName}"/>
	</div>
	<h:commandLink action="#{productController.listProducts}"
						value="List all Products" />
</h:form>
</f:view>
</body>
</html>