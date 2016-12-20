<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="logout" method="post" id="logoutForm">
	  <input type="hidden"
		name="${_csrf.parameterName}"
		value="${_csrf.token}" />
	</form>

	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
     <ul class="nav navbar-nav">
    <li><a class="navbar-brand" href="#">e_Electronics</a></li>
      <li><a href="<c:url value="/"/>">Home</a></li>
       <li><a href="#">About</a></li> 
       
         <c:if test="${pageContext.request.userPrincipal.name!=null}">
     
      <c:if test="${pageContext.request.userPrincipal.name=='admin'}">
        <li><a href="<c:url value="/product"/>">Add new Product</a></li>
        </c:if>
        
          <c:if test="${pageContext.request.userPrincipal.name=='admin'||pageContext.request.userPrincipal.name!='admin'}">
          <li><a href="<c:url value="/list" />">View product</a></li>
          </c:if>
           <c:if test="${pageContext.request.userPrincipal.name  != 'admin'}">
                      <li><a href='<c:url value="/cart" />'>cart</a></li>
                          </c:if>
          
          <li><a>Welcome  ${pageContext.request.userPrincipal.name}</a></li>  
             <li><a href ="javascript:formSubmit()">logout</a></li> 
  </c:if>
 
 
       <c:if test="${pageContext.request.userPrincipal.name==null}">
                        <li><a href="<c:url value="/login" />">Login</a></li>
                        <li><a href="<c:url value="/register" />">Register</a></li>
                        </c:if>
 </ul>   
  </div>
</nav>
</body>
</html>