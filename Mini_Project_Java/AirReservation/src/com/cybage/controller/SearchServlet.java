package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Flight;

@WebServlet("/flight")
public class SearchServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "airreservationsystem";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "P9637333109k@";
        Statement st=null;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("connected!.....");
            String flightId = request.getParameter("flightId");
            System.out.println(flightId);
            ArrayList al = null;
            //Flight flight = null;
            ArrayList flightList = new ArrayList<>();
            String query = "select * from flight";
            if(flightId!=null && !flightId.equals("")){
                query = "select * from flight where flightId='" + flightId + "' ";
            }
            System.out.println("query " + query);
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                al = new ArrayList();
				/*
				 * Flight flight = new Flight();
				 * flight.setFlightId((Integer.parseInt(rs.getString(1))));
				 * flight.setFlightName(rs.getString(2));
				 */
                al.add(rs.getString(1));
                al.add(rs.getString(2));
                al.add(rs.getString(3));
                al.add(rs.getString(4));
                al.add(rs.getString(5));
                al.add(rs.getString(6));
                al.add(rs.getString(7));
                al.add(rs.getString(8));
                al.add(rs.getString(9));
                System.out.println("al :: " + al);
                flightList.add(al);
            }

            request.setAttribute("flightList", flightList);
            RequestDispatcher view = request.getRequestDispatcher("SearchView.jsp");
            view.forward(request, response);
            conn.close();
            System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "getting records from database through servlet controller";
    }// </editor-fold>
}