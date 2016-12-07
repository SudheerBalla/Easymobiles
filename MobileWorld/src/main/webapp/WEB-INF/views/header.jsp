<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>body{
background-image:url(./resources/images/back1.jpg);
}
</style>
</head>
<body>
  <div class="row" style="padding-bottom: 50px; text-align: center;">
  <img src="./resources/images/logo.png" alt="bmlogo" width="100" height="100">           
  </div>
     
 <nav class="navbar navbar-inverse" style="background-color: #004d3d; bottom:50px; border:0px;">
 
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MOBILES</a>
    </div>
    <ul class="nav navbar-nav nav-tabs " style="border: none;">
      <li class="active">
      <a href="index">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">PRODUCTS
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="products">MOBILES</a></li>
          <li><a href="#">ACCESORIES</a></li>
        </ul>
      </li>
      <li><a href="aboutus">about</a></li> 
      <li><a href="contact">contact us</a></li> 
      <li><a href="admin">Admin</a></li> 
    </ul>
    
    <ul class="nav navbar-nav navbar-right nav-tabs"style="border: none;">
    <li><a href="cart"><span
					class="glyphicon glyphicon-shopping-cart"></span>My Cart</a></li>
	
      <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
     