<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    
<!-- fontawesome icons -->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />

<!-- Custom CSS -->
<style><%@ include file="css/style.css" %></style>
<style><%@ include file="css/style3.css" %></style>

</head>
</head>
<body style="background-image: url('https://cdn.mos.cms.futurecdn.net/C7Rq84AtDWGhxAGfoLBPC9.jpg'); background-repeat:no-repeat; background-size:cover">
	<div>
		<%@ include file="header2.jsp"%>
	</div>


<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	String emailid = (String) session.getAttribute("emailid");
	
	%>
	<br/>
	<div style="text-align:center">
	<h2 style="color:black"> Welcome ${emailid}</h2>
	</div>
	<br/>

<h2><a href="searching.jsp">Search  Flight Details</a></h2>
	<div align="center">
		<table style="background-color:daabdd" cellpadding="5">
			<tr>
				<th>Flight Id</th>
				<th>Flight Name</th>
				<th>Flight Number</th>
				<th>Source</th>
				<th>Destination</th>
				<th>No of Stops</th>
				<th>Date Of Travel</th>
				<th>Time Of Travel</th>
				<th>Fare</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="flight" items="${FlightList}">

				<tr style="border:1px solid black">>
					<td><c:out value="${flight.flightId}" /></td>
					<td><c:out value="${flight.flightName}" /></td>
					<td><c:out value="${flight.flightNumber}" /></td>
					<td><c:out value="${flight.source}" /></td>
					<td><c:out value="${flight.destination}" /></td>
					<td><c:out value="${flight.noOfStops}" /></td>
					<td><c:out value="${flight.date}" /></td>
					<td><c:out value="${flight.time}" /></td>
					<td><c:out value="${flight.price}" /></td>
					<td colspan="2" align="center"><input type="submit"
						value="Book Flight" /></td>
				</tr>

			</c:forEach>

		</table>
	</div>
<div>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>