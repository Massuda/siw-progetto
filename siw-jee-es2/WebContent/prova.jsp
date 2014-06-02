<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>prova</title>
</head>
<body>
	<f:view>
		<h1>${orderController.getCustomer().firstName}</h1>
		<h1>${orderController.getCustomer().lastName}</h1>
		<h1>${orderController.getCustomer().email}</h1>
		<h1>${orderController.getCustomer().password}</h1>

	</f:view>
</body>
</html>