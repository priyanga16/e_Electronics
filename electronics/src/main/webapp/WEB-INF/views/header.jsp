<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">e_Electronics</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="<c:url value="/"/>">Home</a></li>
        <li><a href="<c:url value="/addproduct"/>">Add new Product</a></li>
          <li><a href="<c:url value="/product"/>">View product</a></li>
      <!-- <li><a href="#">Product</a></li>
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Product<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Mobile</a></li>
          <li><a href="#">Camera</a></li>
          <li><a href="#">Laptop</a></li></ul>-->
       <!--    <li><a href="register">Register</a></li></ul> -->
      <li><a href="#">About</a></li> 
      <li><a href="#">Contact us</a></li> </ul>
     <!--  <li><a href="#">Login</a></li>
      <li><a href="#">Register</a></li> -->
      <ul class="nav navbar-nav navbar-right">
      <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    
  </div>
</nav>
</body>
</html>