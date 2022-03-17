<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Flight Reservation System</title>
</head>
<body>
    <center>
        <h1>Flight Management</h1>
        <h2>
            <a href="new">Add New Flight</a>
            &nbsp;&nbsp;&nbsp;
            <a href="list">List All Flights</a>
             
        </h2>
    </center>
    <div align="center">
        <c:if test="${flight != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${flight == null}">
            <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
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
                            value="<c:out value='${flight.flightNumber}' />"
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
</body>
</html>