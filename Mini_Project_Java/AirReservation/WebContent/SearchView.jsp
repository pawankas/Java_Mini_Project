<%@ page import="java.util.*" %>
 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
    </head>
    <body>
        <table width="700px" align="center" border="1" cellpadding="5"
               style="border:1px solid #000000;">
            <tr>
                <td colspan=10 align="center"
                    style="background-color:teal">
                    <b>Flight Records</b></td>
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
            <tr style="background-color:<%=color%>;">
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
                <td colspan=4 align="center"
                    style="background-color:#eeffee"><b>No Record Found..</b></td>
            </tr>
            <%            }
            %>
            
        </table>
    </body>
</html>