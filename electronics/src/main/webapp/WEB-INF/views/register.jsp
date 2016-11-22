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
<div align="center">
        <form:form action="register" method="post" commandName="userForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>REGISTRATION</h2></td>
                </tr>
                 <tr>
                    
                    <td><label for="name">Name</label></td>
                    <td><input type="text"><br></td>
                </tr>
                <tr>
                    <td><label for="email">email</label></td>
                    <td><input type="text"><br></td>
                </tr>
                <tr>
                    
                    <td><label for="username">Username</label></td>
                    <td><input type="text"  ><br></td>
                </tr>
                <tr>
                    <td><label for="password">Password</label></td>
                    <td><input type="text"  ><br></td>
                </tr>
                <tr>
                    <td><label for="phone">Phone</label></td>
                    <td><input type="text" ><br></td>
                </tr>
                
            </table>
        </form:form>
    </div>
    <div align="center">
        <form:form action="register" method="post" commandName="userForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>BILLING ADDRESS</h2></td>
                </tr>
                 <tr>
                    
                    <td><label for="street name">Street Name</label></td>
                    <td><input type="text"  ><br></td>
                </tr>
                <tr>
                    <td><label for="apartment Number">Apartment Number</label></td>
                    <td><input type="text"  "><br></td>
                </tr>
                <tr>
                    
                    <td><label for="city">City</label></td>
                    <td><input type="text"  ><br></td>
                </tr>
                <tr>
                    <td><label for="state">State</label></td>
                    <td><input type="text"  ><br></td>
                </tr>
                <tr>
                    <td><label for="country">Country</label></td>
                    <td><input type="text" ><br></td>
                </tr>
                <tr>
                    <td><label for="zipcode">Zipcode</label></td>
                    <td><input type="text"><br></td>
                </tr>
                
            </table>
        </form:form>
    </div>
     <div align="center">
        <form:form action="register" method="post" commandName="userForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>SHIPPING ADDRESS</h2></td>
                </tr>
                 <tr>
                    
                    <td><label for="street name">Street Name</label></td>
                    <td><input type="text"><br></td>
                </tr>
                <tr>
                    <td><label for="apartment Number">Apartment Number</label></td>
                    <td><input type="text"><br></td>
                </tr>
                <tr>
                    
                    <td><label for="city">City</label></td>
                    <td><input type="text" ><br></td>
                </tr>
                <tr>
                    <td><label for="state">State</label></td>
                    <td><input type="text"  ><br></td>
                </tr>
                <tr>
                    <td><label for="country">Country</label></td>
                    <td><input type="text"  ><br></td>
                </tr>
                <tr>
                    <td><label for="zipcode">Zipcode</label></td>
                    <td><input type="text"  ><br></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="SUBMIT" /></td>
                </tr>
                 <tr>
                    <td colspan="2" align="center"><input type="submit" value="EXIT" /></td>
                </tr>
            </table>
        </form:form>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>