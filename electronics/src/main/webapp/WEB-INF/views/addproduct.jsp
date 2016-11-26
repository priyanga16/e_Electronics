<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
 <%@include file="header.jsp" %> 
<html>
<head>
	<title>product Page</title>
	 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<div class="container">
<h1>
	Add a Product
</h1>
<%-- <spring:url value="/add?${_csrf.parameterName}=${_csrf.token}" var="Actionurl"/>
 <form class="form-horizontal" method="post"
 modelAttribute="product" action="${Actionurl}">
 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" path="productid"/> --%>
 <form>
  <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}"path="productid" />
 
    <div class="form-group">
      <label for="productname">Name</label>
      <input type="text" path="productname" class="form-control" id="productname">
      </div>
      <div class="form-group">
      <label for="productdescription">Description</label>
      <input type="text" path="productdescription" class="form-control" id="productdescription">
      </div>
      <div class="form-group">
      <label for="productprice">Price</label>
      <input type="text" path="productprice" class="form-control" id="productprice">
      </div>
      <div class="form-group">
      <label for="unitinstock">Unit in stock</label>
      <input type="text" path="unitinstock" class="form-control" id="unitinstock">
      </div>
      </form>
      <div class="container">
 
 <h4>Categories</h4>
  <form>
    <label class="radio-inline">
      <input type="radio" name="optradio">Original price
    </label>
    <label class="radio-inline">
      <input type="radio" name="optradio">Offer price
    </label>
   
  </form>
</div>
      
      <div class="container">
      <div class="btn-group">
      <spring:url value="/list" var="add"/>
     <button type="button" class="btn btn-primary" onclick="location.href='${add}'">Add</button>
      <button type="button" class="btn btn-primary">Update</button>
  </div>
 </div>   
</div>
      
       <%@include file="footer.jsp" %> 
      </body>
      </html>
