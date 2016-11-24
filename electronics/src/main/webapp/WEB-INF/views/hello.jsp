<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="D:\priyanga\images\maxresdefault.jpg " alt="Samsung" class="img-responsive" width="840" height="230">
    </div>

    <div class="item">
      <img src="D:\priyanga\images\8X-Press-02-580-90.jpg" alt="Redmi 3s" class="img-responsive"width="840" height="230">
    </div>

    <div class="item">
      <img src="D:\priyanga\images\thumbnail_2_1f6f4750_v2.jpg" alt="Nikon"class="img-responsive"width="840" height="230">
    </div>

    <div class="item">
      <img src="D:\priyanga\images\hp-pavilion-hdx18-1050ef-3.jpg" alt="hp"class="img-responsive"width="840" height="230">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

<div class="container-fluid">
  <div class="row">
    <div class="col-sm-6" style="background-color:pink;">
      NIIT Limited is an Indian Multinational company that offers learning management and training delivery solutions to corporations, institutions and individuals. It has three main lines of business worldwide: Corporate Learning Group (CLG), Skills and Careers Group (SNC), and School Learning Group (SLG).

In 2006, the IT services business of NIIT was demerged into a separately listed company NIIT Technologies.[4] NIIT Limited now focuses on Corporate Training, Vocational Training for Services Sectors and Education and Training in Schools. 
    </div>
    <div class="col-sm-6" style="background-color:pink;">
      
    <div class="embed-responsive embed-responsive-16by9">
    <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/XGSy3_Czz8k"></iframe>
    </div>
    </div>
  </div>
    </div>
 
  <div class="jumbotron"> 
  <h1>Online Electronic Shop</h1>
<div class="container marketing">
<div class="row">
  <div class="col-lg-3">
  <a href="D:\priyanga\images\hp-pavilion-hdx18-1050ef-3.jpg" >
      <img class="img-thumbnail" src="D:\priyanga\images\hp-pavilion-hdx18-1050ef-3.jpg" alt="Pulpit Rock" width="250" height="150">
    </a>
    </div>
    <div class="row">
  <div class="col-lg-3">
    <a href="D:\priyanga\images\maxresdefault.jpg" >
      <img class="img-thumbnail" src="D:\priyanga\images\maxresdefault.jpg " alt="Samsung" width="250" height="150">
    </a>
    </div>
  <div class="row">
  <div class="col-lg-3">
    <a href="D:\priyanga\images\8X-Press-02-580-90.jpg">
     <img class="img-thumbnail" src="D:\priyanga\images\8X-Press-02-580-90.jpg" alt="Redmi 3s" width="250" height="150">     
    </a>
  </div>
 </div>
</div>
</div>
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>