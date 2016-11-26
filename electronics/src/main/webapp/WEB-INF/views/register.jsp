<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h2>Registration</h2>
 
  
    <div class="form-group">
      <label for="name">Name:</label>
      <input path="name" class="form-control" id="name" placeholder="Enter name">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input path="email" class="form-control" id="email" placeholder="Enter Email">
    </div>
    <div class="form-group">
      <label for="phone">Phone:</label>
      <input path="phone" class="form-control" id="phone" placeholder="Enter phone">
    </div>
     <div class="form-group">
      <label for="username">Username:</label>
      <input path="username" class="form-control" id="username" placeholder="Enter username">
    </div> 
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" id="password" placeholder="Enter password">
    </div>
    
     <h2>Billing Address</h2>
 
  
    <div class="form-group">
      <label for="apartmentnumber">Apartment number</label>
      <input path="billingaddress.apartmentnumber" class="form-control" id="apartmentnumber" placeholder="Enter apartmentnumber">
    </div>
    <div class="form-group">
      <label for="streetname">Streetname:</label>
      <input path="billingaddress.streetname" class="form-control" id="streetname" placeholder="Enter streetname">
    </div>
    <div class="form-group">
      <label for="city">city:</label>
      <input path="billingaddress.city" class="form-control" id="city" placeholder="Enter city">
    </div>
     <div class="form-group">
      <label for="state">State:</label>
      <input path="billingaddress.state" class="form-control" id="state" placeholder="Enter state">
    </div>
    <h2>Shipping Address</h2>
 
  
    <div class="form-group">
      <label for="apartmentnumber">Apartment number</label>
      <input path="billingaddress.apartmentnumber" class="form-control" id="apartmentnumber" placeholder="Enter apartmentnumber">
    </div>
    <div class="form-group">
      <label for="streetname">Streetname:</label>
      <input path="billingaddress.streetname" class="form-control" id="streetname" placeholder="Enter streetname">
    </div>
    <div class="form-group">
      <label for="city">city:</label>
      <input path="billingaddress.city" class="form-control" id="city" placeholder="Enter city">
    </div>
     <div class="form-group">
      <label for="state">State:</label>
      <input path="billingaddress.state" class="form-control" id="state" placeholder="Enter state">
      </div>
      </div>
      <div class="container">
      <div class="btn-group">
      <button type="button" class="btn btn-primary">Submit</button>
      </div>
      </div>
      </body>
      </html>
    