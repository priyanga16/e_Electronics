<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h2>Registration</h2>
  </div>
 <c:url value="/register" var="url"/>
  <form:form action="${url}" method="post" commandName="customer">
  
 <div class="form-group">
      <label for="name">Name:</label>
      <form:input path="name" class="form-control"  placeholder="Enter name"/>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <form:input path="email" class="form-control"  placeholder="Enter Email"/>
    </div>
    <div class="form-group">
      <label for="phone">Phone:</label>
      <form:input path="phone" class="form-control"  placeholder="Enter phone"/>
    </div>
     <div class="form-group">
      <label for="username">Username:</label>
      <form:input path="username" class="form-control"  placeholder="Enter username"/>
    </div> 
    <div class="form-group">
      <label for="password">Password:</label>
      <form:input path="password" type="password" class="form-control" placeholder="Enter password"/>
    </div>
    
     <h2>Billing Address</h2>
 
  
    <div class="form-group">
      <label for="apartmentnumber">Apartment number</label>
      <form:input path="billingaddress.Apartmentnumber" class="form-control"  placeholder="Enter apartmentnumber"/>
    </div>
    <div class="form-group">
      <label for="streetname">Streetname:</label>
      <form:input path="billingaddress.streetname" class="form-control" placeholder="Enter streetname"/>
    </div>
    <div class="form-group">
      <label for="city">city:</label>
      <form:input path="billingaddress.city" class="form-control"  placeholder="Enter city"/>
    </div>
     <div class="form-group">
      <label for="state">State:</label>
      <form:input path="billingaddress.state" class="form-control"  placeholder="Enter state"/>
    </div>
    <h2>Shipping Address</h2>
 
  
    <div class="form-group">
      <label for="apartmentnumber">Apartment number</label>
      <form:input path="shippingaddress.Apartmentnumber" class="form-control" placeholder="Enter apartmentnumber"/>
    </div>
    <div class="form-group">
      <label for="streetname">Streetname:</label>
      <form:input path="shippingaddress.streetname" class="form-control" placeholder="Enter streetname"/>
    </div>
    <div class="form-group">
      <label for="city">city:</label>
      <form:input path="shippingaddress.city" class="form-control" placeholder="Enter city"/>
    </div>
     <div class="form-group">
      <label for="state">State:</label>
      <form:input path="shippingaddress.state" class="form-control" placeholder="Enter state"/>
      </div>
       <input type="submit" value="submit" class="btn btn-primary">
  </form:form>
      </body>
      </html>
    