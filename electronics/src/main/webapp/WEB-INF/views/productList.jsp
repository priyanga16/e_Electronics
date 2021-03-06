<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
 <%@include file="header.jsp" %> 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <title>Users List</title>
</head>
 
<body>
<%-- <c:url var="productList" value="/list" ></c:url> --%>

    <div class="generic-container">
          
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">List of Products</span></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Unit in stock</th>
                       <%--  <sec:authorize access="hasRole('ADMIN') or hasRole('USER')">
                            <th width="100"></th>
                        </sec:authorize>
                        <sec:authorize access="hasRole('ADMIN')">
                            <th width="100"></th>
                        </sec:authorize>  --%>
                         
                    </tr>
                </thead>
                <tbody>
                <c:forEach  var="product" items="${productList}">
                    <tr>
                        <td>${product.productid}</td>
                        <td>${product.productname}</td>
                        <td>${product.productdescription}</td>
                        <td>${product.productprice}</td>
                        <td>${product.unitinstock}</td>
                        <%-- <sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
                            <td><a href="<c:url value='/edit-user-${user.ssoId}' />" class="btn btn-success custom-width">edit</a></td>
                        </sec:authorize>
                        <sec:authorize access="hasRole('ADMIN')">
                            <td><a href="<c:url value='/delete-user-${user.ssoId}' />" class="btn btn-danger custom-width">delete</a></td>
                        </sec:authorize> --%>
                     <td>
                 <button type="button" class="btn btn-success">Update</button>
                 <button type="button" class="btn btn-danger">Delete</button>
				</td> 
    </tr>
     </c:forEach>  
    </table>
    </div>
         </div>
                </body>
            
        <%-- <sec:authorize access="hasRole('ADMIN')">
            <div class="well">
                <a href="<c:url value='/newuser' />">Add New User</a>
            </div>
        </sec:authorize> --%>
   
    
     <%@include file="footer.jsp" %> 
</body>
</html>