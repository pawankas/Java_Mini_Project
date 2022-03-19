<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight List</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    
<!-- fontawesome icons -->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />

<!-- Custom CSS -->
<style><%@ include file="css/style.css" %></style>
<style><%@include file="css/style2.css" %></style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div>
		<%@ include file="header1.jsp"%>
	</div>
	
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	String emailid = (String) session.getAttribute("emailid");
	
	%>
	<div style="text-align:center">
	<h2 style="color:white"> Welcome ${emailid}</h2>
	</div>
	<br/>
	<center>
		<h1 style="color:yellow">Flight Management</h1>
	
	</center>
<div align="center">
		<table cellpadding="5" style="background-color:lightgreen;">
		
			<tr style="border:1px solid black">
				<th style="border:1px solid black">Flight Id</th>
				<th style="border:1px solid black">Flight Name</th>
				<th style="border:1px solid black">Flight Number</th>
				<th style="border:1px solid black">Source</th>
				<th style="border:1px solid black">Destination</th>
				<th style="border:1px solid black">No of Stops</th>
				<th style="border:1px solid black">Date Of Travel</th>
				<th style="border:1px solid black">Departure Time</th>
				<th style="border:1px solid black">Fare</th>
				<th style="border:1px solid black">Actions</th>
			</tr>
			<c:forEach var="flight" items="${FlightList}">

				<tr style="border:1px solid black">
					<td style="border:1px solid black"><c:out value="${flight.flightId}" /></td>
					<td style="border:1px solid black"><c:out value="${flight.flightName}" /></td>
					<td style="border:1px solid black"><c:out value="${flight.flightNumber}" /></td>
					<td style="border:1px solid black"><c:out value="${flight.source}" /></td>
					<td style="border:1px solid black"><c:out value="${flight.destination}" /></td>
					<td style="border:1px solid black"><c:out value="${flight.noOfStops}" /></td>
					<td style="border:1px solid black"><c:out value="${flight.date}" /></td>
					<td style="border:1px solid black"><c:out value="${flight.time}" /></td>
					<td style="border:1px solid black"><c:out value="${flight.price}" /></td>
					<td style="border:1px solid black"><a style="color:blue"
						href="edit?flightId=<c:out value='${flight.flightId}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a style="color:blue"
						href="delete?flightId=<c:out value='${flight.flightId}' />">Delete</a>
					</td>
				</tr>
			</c:forEach>

		</table>
	</div>
	



	<div>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>