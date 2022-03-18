<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Flight Reservation System</title>


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
	<center>
		<h1>Flight Management</h1>
		<h2>
			<a href="new">Add New Flight</a> &nbsp;&nbsp;&nbsp; <a
				href="search.jsp">Search Flight</a>

		</h2>
	</center>

	<div class="container px-4">
		<div class="row gx-5">
			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchByTime">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									<h3>Search for Flight</h3>
								</td>
							</tr>
							<tr>
								<td><b>Departure Time</b></td>
							</tr>
							<tr>
							<td>: <input type="text" name="time" id="time">
								</td>
							</tr>
							<tr>
								<td colspan=2 align="center"><input type="submit"
									value="Search"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchByName">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									<h3>Search for Flight</h3>
								</td>
							</tr>
							<tr>
								<tr>
								<td><b>Flight Name</b></td>
							</tr>
								<td>: <input type="text" name="flightName" id="flightName">
								</td>
							</tr>
							<tr>
								<td colspan=2 align="center"><input type="submit"
									value="Search"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchBySource">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									<h3>Search for Flight</h3>
								</td>
							</tr>
							<tr>
								<tr>
								<td><b>Source</b></td>
							</tr>
								<td>: <input type="text" name="source" id="source">
								</td>
							</tr>
							<tr>
								<td colspan=2 align="center"><input type="submit"
									value="Search"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			
			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchByDestination">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									<h3>Search for Flight</h3>
								</td>
							</tr>
							<tr>
								<tr>
								<td><b>Destination</b></td>
							</tr>
								<td>: <input type="text" name="destination" id="destination">
								</td>
							</tr>
							<tr>
								<td colspan=2 align="center"><input type="submit"
									value="Search"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			
			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchByDate">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									<h3>Search for Flight</h3>
								</td>
							</tr>
							<tr>
								<tr>
								<td><b>Date of Departure</b></td>
							</tr>
								<td>: <input type="text" name="date" id="date">
								</td>
							</tr>
							<tr>
								<td colspan=2 align="center"><input type="submit"
									value="Search"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			
		</div>
	</div>







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
				<th>Departure Time</th>
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
					<td><a
						href="edit?flightId=<c:out value='${flight.flightId}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete?flightId=<c:out value='${flight.flightId}' />">Delete</a>
					</td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>