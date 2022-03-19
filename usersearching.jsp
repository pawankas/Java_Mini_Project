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
		<%@ include file="header2.jsp"%>
	</div> 
	<%-- <c:import url="/Header1.jsp" charEncoding="UTF-8"/> --%>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	String emailid = (String) session.getAttribute("emailid");
	
	%>
	
	<div style="text-align:center">
	<h2 style="color:white"> Welcome ${emailid}</h2>
	</div>
	<br/>
	
<div class="container px-4">
		<div class="row gx-5">
		
			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchByTime">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									
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
	<!-- 		<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchBySource">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									
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
			</div> -->
			
<!-- 			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchByDestination">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									
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
			</div> -->
			
			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchByDate">
						<table border="0" width="300" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
									
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
			
			<div class="col">
				<div class="p-1 border bg-light">
					<form method="post" action="SearchBySourceAndDestination">
						<table border="0" align="center">
							<tr>
								<td colspan=2 style="font-size: 12pt;" align="center">
								
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
								<td><b>Destination</b></td>
							</tr>
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
			
		</div>
	</div>
	
<div>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>