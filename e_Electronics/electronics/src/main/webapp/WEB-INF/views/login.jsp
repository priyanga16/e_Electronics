<!DOCTYPE html>
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
  <h2>LOGIN</h2>
  <form>
    <div class="form-group">
      <label for="usr">UserName</label>
      <input type="text" class="form-control" name="username" id="usr">
    </div>
    <div class="form-group">
      <label for="pwd">Password</label>
      <input type="password" class="form-control" name="password" id="pwd">
    </div>
     <div class="container">
      <div class="btn-group">
      <spring:url value="/list" var="add"/>
     <button type="button" class="btn btn-primary" onclick="location.href='${add}'">Login</button>
    
  </div>
 </div>
  </form>
</div>

</body>
</html>

