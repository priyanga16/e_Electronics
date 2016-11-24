<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
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
 <form>
    <div class="form-group">
      <label for="product">Name</label>
      <input type="text" class="form-control" id="product">
      </div>
      <div class="form-group">
      <label for="product">Description</label>
      <input type="text" class="form-control" id="product">
      </div>
      <div class="form-group">
      <label for="product">Price</label>
      <input type="text" class="form-control" id="product">
      </div>
      <div class="form-group">
      <label for="product">Unit in stock</label>
      <input type="text" class="form-control" id="product">
      </div>
      </form>
      </div>
      </body>
      </html>
<%-- <<%-- c:url var="addproduct" value="/product" ></c:url>

<form:form action="${addproduct}" commandName="product">
<table>
	<c:if test="${!empty product.productname}">
	<tr>
		<td>
			<form:label path="productid">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="productid" readonly="true" size="8"  disabled="true" />
			<form:hidden path="productid" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="productname">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="productname" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="productdescription">
				<spring:message text="Description"/>
			</form:label>
		</td>
		<td>
			<form:input path="productdescription" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="productprice">
				<spring:message text="Price"/>
			</form:label>
		</td>
		<td>
			<form:input path="productprice" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="unitinstock">
				<spring:message text="Unit in stock"/>
			</form:label>
		</td>
		<td>
			<form:input path="unitinstock" />
		</td>
	</tr> --%>
	
	<%-- <tr>
		<td colspan="2">
			<c:if test="${!empty person.name}">
				<input type="submit"
					value="<spring:message text="Edit Person"/>" />
			</c:if>
			<c:if test="${empty person.name}">
				<input type="submit"
					value="<spring:message text="Add Person"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form> --%> --%>