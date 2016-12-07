<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js

"></script>
<%@include file="header.jsp"%>


<div class="container">

	<table class="table table-bordered table-hover table-striped">

		<tr>

			<th>Product Name</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Total</th>
			<th>Image</th>
		</tr>
		<c:forEach var="ad" items="${Crt}">
		<tr>

			<td>${ad.pname}</td>

			<td>${ad.quantity}</td>
			<td>${ad.price}</td>
			<td>${ad.total}</td>

			<td><img src="./resources/images/${ad.pid}.jpg" height="50px"
				width="50px" /></td>

		</tr>


		</c:forEach>
	</table>
</div>


<%@include file="footer.jsp"%>