<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  body{

  margin:0px;
  
  }
  main{
  width:100%;
  
  margin-top:0%;
  border:2px solid black;
  display:grid;
  grid-template-rows:655px;
  grid-template-columns:1fr;
  }
  .div{
  background:skyblue;
  
  }
  h1{
  margin-top:4%;
  }
  #dom{
  margin-left:10%;
  }
  button{
  width:25%;
  }
  .image{
  margin-left:5%;
  }
  </style>
  </head>
<body>
<main>
  <div class="div">
  <h1 id="dom">Domino's Online Ordering </h1>
  <div id="dom"><h4 style="color:;">Yummy pizza delivered fast & fresh </h4></div>
  
  <form action="orderpage.html" method="post">
  <button type="submit" class="btn btn-success" id="dom"><h2>Order Online Now </h2></button>
  <img src="images/zerocontactpic.png" >
  </form>
   
  </div>
  </main>

</body>
</html>