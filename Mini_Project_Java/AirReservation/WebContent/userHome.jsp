<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Flight Reservation System</title>
</head>
<body>
	<center>
		<h1>Welcome to User Home Page</h1>

	</center>
	<center>


		<form method="post" action="">
			<table border="0" width="300" align="center" bgcolor="#e9fh">
				<tr>
					<td colspan=2 style="font-size: 12pt;" align="center">
						<h3>Search Details</h3>
					</td>
				</tr>
				<tr>
					<td><b>Flight Name:</b></td>
					<td>: <input type="text" name="flightName" id="flightName">
					</td>
				</tr>
				<tr>
					<td colspan=2 align="center"><input type="submit"
						value="Search"></td>
				</tr>
			</table>
		</form>
	</center>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Flights</h2>
			</caption>
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

				<tr>
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

</body>
</html>