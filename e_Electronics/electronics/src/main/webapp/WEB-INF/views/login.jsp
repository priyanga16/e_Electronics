<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
<div id="login-box">
  <h2>LOGIN</h2>
   <c:if test="${not empty logout}">
<div class="logout">${logout}</div>
</c:if>
  
  <form name='loginForm' action="<c:url value='/j_spring_security_check'/>" method='POST'>
  <c:if test="${not empty error}">
<div class="error">${error}</div>
</c:if>
  
    <div class="form-group">
      <label for="username">UserName</label>
      <input type="text" class="form-control" name="username" id="username">
    </div>
    <div class="form-group">
      <label for="password">Password</label>
      <input type="password" class="form-control" name="password" id="password">
    </div>
     <!-- <div class="container">
      <div class="btn-group">
       <spring:url value="/list" var="add"/>  -->
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
     <button type="submit" class="btn btn-primary" onclick="location.href='${add}'">Login</button>
    
  <!-- </div>
 </div> -->
 
  </form>
 </div> 
</div>

</body>
</html>

