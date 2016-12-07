<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js">
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"> < link
	href = "https://fonts.googleapis.com/css?family=Open+Sans:400,700"
	rel = "stylesheet"
</script>
<style>
.panel.panel--styled {
    background: #F4F2F3;
}
.panelTop {
    padding: 30px;
}

.panelBottom {
    border-top: 1px solid #e7e7e7;
    padding-top: 20px;
}
p {
 text-align: center; color: red; 
 }
.button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	}
span.itemPrice {
    
    color: #FA5B58;
}
h2 {
text-align: center; cyan
} 

</style>
<title>UserProducts</title>
<jsp:include page="header.jsp" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="panel panel-default  panel--styled">
					<div class="panel-body">
						<div class="col-md-12 panelTop">
							<div class="col-md-4">
								<img class="img-responsive"
									src="./resources/images/${Product.pid}.jpg" alt="" />
							</div>
							<div class="col-md-8">
								<h2>${Product.pname}</h2>
								 <p>${Product.pdes}</p>
							</div>
						</div>

						<div class="col-md-12 panelBottom">
							<div class="col-md-4 text-left">
								<h3>
									Price <span class="itemPrice">${Product.pprice}</span>
								</h3>
							</div>
							<form action="AddToCart">
								<input type="hidden" name="pid" value=${Product.pid } />
								Quantity<input type="text" name="s" value=1 /> <input
									type="submit" class="button" value="AddToCart">
							</form>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



	<jsp:include page="footer.jsp" />
</body>
</html>