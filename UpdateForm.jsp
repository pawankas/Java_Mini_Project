<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    
<!-- fontawesome icons -->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />

<!-- Custom CSS -->
<style><%@ include file="css/style.css" %></style>
<body style="background-image: url('https://cdn.wallpapersafari.com/39/84/brdSxW.jpg'); background-repeat:no-repeat; background-size:cover">
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
        <h2 style="color:yellow">Flight Management</h2>
        <h3>
            <a href="new" style="color:yellow">Add New Flight</a>
            &nbsp;&nbsp;&nbsp;
            <a href="list" style="color:yellow">List All Flights</a>
             
        </h3>
    </center>
    <div align="center">
        <c:if test="${flight != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${flight == null}">
            <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5" style="background-color:lightgreen">
            <caption>
                <h2>
                    <c:if test="${flight != null}">
                        Edit Flight
                    </c:if>
                    <c:if test="${flight == null}">
                        Add New Flight
                    </c:if>
                </h2>
            </caption>
                <c:if test="${flight != null}">
                    <input type="hidden" name="flightId" 
                    value="<c:out value='${flight.flightId}' />" />
                </c:if>           
            <tr>
                <th>Flight Name: </th>
                <td>
                    <input type="text" name="flightName" size="45"
                            value="<c:out value='${flight.flightName}' />"
                        />
                </td>
            </tr>
            <tr>
                <th>Flight Number: </th>
                <td>
                    <input type="text" name="flightNumber" size="45"
                            '${flight.flightNumber} />"
                    />
                </td>
            </tr>
             <tr>
                <th>Source: </th>
                <td>
                    <input type="text" name="source" size="45"
                            value="<c:out value='${flight.source}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Destination: </th>
                <td>
                    <input type="text" name="destination" size="45"
                            value="<c:out value='${flight.destination}' />"
                    />
                </td>
            </tr>
             <tr>
                <th>No of Stops: </th>
                <td>
                    <input type="text" name="noOfStops" size="45"
                            value="<c:out value='${flight.noOfStops}' />"
                    />
                </td>
            </tr>
            <tr>
             <tr>
                <th>Date Of Travel: </th>
                <td>
                    <input type="date" name="date" size="45"
                            value="<c:out value='${flight.date}' />"
                    />
                </td>
            </tr>
             <tr>
                <th>Time of Travel: </th>
                <td>
                    <input type="time" name="time" size="45"
                            value="<c:out value='${flight.time}' />"
                    />
                </td>
            </tr>
             <tr>
                <th>Fare: </th>
                <td>
                    <input type="text" name="price" size="45"
                            value="<c:out value='${flight.price}' />"
                    />
                </td>
            </tr>
                <td colspan="2" align="center">
                    <input type="submit" value="update" />
                </td>
            </tr>
        </table>
        </form>
    </div>   
    <div>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>