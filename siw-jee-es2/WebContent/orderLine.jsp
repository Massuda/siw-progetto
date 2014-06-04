<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>orderLine</title>
</head>
<body>
	<f:view>
		<h1>${orderLineController.id}</h1>

	
	<div>
		<a href='<c:url value="/faces/customerHome.jsp" />'>home</a>
	</div>

</f:view>
</body>
</html>