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
<h1>
update a Product
</h1>
<body>
<div class="container">

 <spring:url value="/add" var="url"/>
 <form:form class="form-horizontal" modelAttribute="product" action="${url}" method="post" > 
    
    <div class="form-group">
      <label for="name">Name</label>
      <form:input type="text" path="productname" class="form-control"  id="Name"/>
      </div>
      
      <div class="form-group">
      <label for="Description">Description</label>
      <form:input type="text" path="productdescription" class="form-control"  id="Description"/>
      </div>
      
      <div class="form-group">
      <label for="Price">Price</label>
      <form:input type="text" path="productprice" class="form-control"   id="Price"/>
      </div>
      
      <div class="form-group">
      <label for="Unit">Unit in stock</label>
      <form:input type="text" path="unitinstock" class="form-control"    id="Unit"/>
      </div>
     
      <div class="container">
 
 <h4>Categories</h4>
 <%-- 
 <tr>
                <td>Do you want the big size?</td>
                <td><form:radiobutton path="category" value="orgican"  id="gender"/> Yes
                 <form:radiobutton path="category" value="actualcat"/> No </td>
            </tr>
 
 <tr>
      --%>       <td>Are you <font color="red">*</font></td>
            <td>
                <form:radiobutton path="category" value="originalprice" label="originalprice" id="category"/>
                <form:radiobutton path="category" value="offerprice" label="offer price" id="category"/>
                
            </td>
           
        </tr>
 
 
 <!-- <label class="radio-inline">
  <form:radiobutton path="category" value="originalprice"/>original price
</label>
<label class="radio-inline">
<form:radiobutton path="category" value="offerprice"/>offer price
  </label> --%>
    <!-- <label class="radio-inline">
      <input type="radio" value="Originalprice" path="category">Original price
    </label>
    
    <label class="radio-inline">
      <input type="radio" value="offerprice"  path="category"> Offer price
    </label> -->
   </div>
 
      <div class="container">
      <div class="btn-group">
      <spring:url value="/list" var="add"/>
     <button type="submit" value ="submit" class="btn btn-primary">Add</button>
      <button type="submit" class="btn btn-primary">Update</button>
      
  </div>
 </div>   
   </form:form>    
      </div>
      </body>
       <%@include file="footer.jsp" %> 
      </html>
