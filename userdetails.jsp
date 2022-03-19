<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<%@page import="com.cybage.dao.UserDao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    
<!-- fontawesome icons -->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />

<!-- Custom CSS -->
<style><%@ include file="css/style.css" %></style>
</head>
<body style="background-image: url('https://cdn.mos.cms.futurecdn.net/C7Rq84AtDWGhxAGfoLBPC9.jpg'); background-repeat:no-repeat; background-size:cover">
	<div>
		<%@ include file="header.jsp"%>
	</div>
	<br/>
 <h1 style="text-align:center">User successfully registered!</h1>
 <h2 style="text-align:center"><a href="registeruser.jsp">Login to Book the Flight</a></h2>
 	<div>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>