<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Customer registration</title>
</head>
<body>
<f:view>
<h:form>
    <div>First name: <h:inputText value="#{customerController.firstName}" 
                     required="true"
                     requiredMessage="First name is mandatory"
                     id="firstName"/> <h:message for="firstName" />
	</div>
    
    <div>Last name: <h:inputText value="#{customerController.lastName}" 
                     required="true"
                     requiredMessage="Last name is mandatory"
                     id="lastName"/> <h:message for="lastName" />
	</div>
    
    <div>Phone number: <h:inputText value="#{customerController.phoneNumber}" 
                     required="false" />
	</div>
    <div>Email: <h:inputText value="#{customerController.email}" 
    				 required="true"
                     requiredMessage="Email is mandatory"
                     id="email"/> <h:message for="email" />
                     
	</div>
	<div>Password: <h:inputText value="#{customerController.password}" 
    				 required="true"
                     requiredMessage="Password is mandatory"
                     id="password"/> <h:message for="password" />
                     
	</div>
	<div>Date of birth: <h:inputText value="#{customerController.dateOfBirth}" 
                     required="false" />
    </div>
    
    <div>Address:</div>
    <div>City: <h:inputText value="#{addressController.city}" 
    				 required="true"
                     requiredMessage="City is mandatory"
                     id="city"/> <h:message for="city" />                    
	</div> 
	<div>Country: <h:inputText value="#{addressController.country}" 
    				 required="true"
                     requiredMessage="Country is mandatory"
                     id="country"/> <h:message for="country" />                    
	</div> 
	<div>State: <h:inputText value="#{addressController.state}" 
    				 required="true"
                     requiredMessage="State is mandatory"
                     id="state"/> <h:message for="state" />                    
	</div> 
	<div>Street: <h:inputText value="#{addressController.street}" 
    				 required="true"
                     requiredMessage="Street is mandatory"
                     id="street"/> <h:message for="street" />                    
	</div> 
	<div>Zipcode: <h:inputText value="#{addressController.zipcode}" 
    				 required="true"
                     requiredMessage="Zipcode is mandatory"
                     id="zipcode"/> <h:message for="zipcode" />                    
	</div> 
	<div>
		<h:commandButton value="Submit address"  action="#{addressController.createAddress}"/>
	</div>
	<div>
		<h:commandButton value="Submit"  action="#{customerController.createCustomer}"/>
	</div>
	
</h:form>
</f:view>
</body>
</html>