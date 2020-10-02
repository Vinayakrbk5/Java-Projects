<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  #names{
  width:300px;
  margin:20px;
  }
  #phone{
  width:200px;
  margin:20px;
  }
  #address{
  
  width:500px;
  margin:20px;
  }
  
  </style>
</head>
<body>
<form action="address" method="post">
<div class="jumbotron">
<h2>Delivery Address :</h2>
<div class="form-group"> 
<input type="text" name="name" placeholder="enter name" class="form-control"id="names">
</div>

<div class="form-group">
<input type="number" name="number" placeholder="enter mobile number"class="form-control" id="phone">
</div>
<div class="form-group">
<input type="text" name="address" placeholder="enter delivery address"class="form-control" id="address">
</div>

<button type="submit" class="btn btn-success"> Submit</button>
<button type="reset"class="btn btn-danger"> Cancel </button>
</div>
</form>
</body>
</html>