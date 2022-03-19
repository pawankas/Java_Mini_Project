<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE HTML>
<html>
    <head>
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
	
	        <table align="center" border="1" cellpadding="5"
               style="border:1px solid #000000;">
            <tr>
                <td colspan=10 align="center"
                    style="background-color:white">
                   <h2><b>Flight Records</b></h2></td>
            </tr>
            <tr style="background-color:lightgrey;">
                <td><b>Flight Id</b></td>
                <td><b>Flight Name</b></td>
                <td><b>Flight Number</b></td>
                <td><b>Source</b></td>
                <td><b>Destination</b></td>
                <td><b>No of Stops</b></td>
                <td><b>Date of Travel</b></td>
                <td><b>Time Of Departure</b></td>
                <td><b>Fare</b></td>
                <td><b>Actions</b></td>
               
            </tr>
            
            <%
                int count = 0;
                String color = "";
                if (request.getAttribute("flightList") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("flightList");
                    System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {

                        if ((count % 2) == 0) {
                            color = "";
                        }
                        count++;
                        ArrayList flightList = (ArrayList) itr.next();
            %>
            <tr style="background-color:lightgreen;">
                <td><%=flightList.get(0)%></td>
                <td><%=flightList.get(1)%></td>
                <td><%=flightList.get(2)%></td>
                <td><%=flightList.get(3)%></td>
                <td><%=flightList.get(4)%></td>
                <td><%=flightList.get(5)%></td>
                <td><%=flightList.get(6)%></td>
                <td><%=flightList.get(7)%></td>
                <td><%=flightList.get(8)%></td>
			<c:forEach var="flight" items="${FlightList}">
				<td><a
					href="edit?flightId=<c:out value='${flight.flightId}' />">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp; <a
					href="delete?flightId=<c:out value='${flight.flightId}' />">Delete</a>
				</td>
			</c:forEach>
		</tr>
            
            <%
                    }
                }
                if (count == 0) {
            %>
            <tr>
                <td colspan=10 align="center"
                    style="background-color:#eeffee"><b>No Record Found..</b></td>
            </tr>
            <%            }
            %>
            
        </table>
        	<div>
		<%@ include file="footer.jsp"%>
	</div>
    </body>
</html>