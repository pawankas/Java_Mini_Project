package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.FlightDao;
import com.cybage.model.Flight;

@WebServlet("/")
public class FlightControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FlightDao flightDao;

	public void init() {
		flightDao = new FlightDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertFlight(request, response);
				break;
			case "/delete":
				deleteFlight(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateFlight(request, response);
				break;
			case "/uflist":
				userFlightList(request, response);
				break;
			case "/Search":
				searchFlightById(request, response);
				break;
			default:
				FlightList(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void FlightList(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Flight> FlightList = flightDao.selectAllFlights();
		request.setAttribute("FlightList", FlightList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("FlightList.jsp");
		dispatcher.forward(request, response);
	}

	private void userFlightList(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Flight> FlightList = flightDao.selectAllFlights();
		request.setAttribute("FlightList", FlightList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("userHome.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("FlightForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int flightId = Integer.parseInt(request.getParameter("flightId"));
		Flight existingFlight = flightDao.selectFlight(flightId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateForm.jsp");
		request.setAttribute("flight", existingFlight);
		dispatcher.forward(request, response);

	}

	private void insertFlight(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String flightName = request.getParameter("flightName");
		String flightNumber = request.getParameter("flightNumber");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String noOfStops = request.getParameter("noOfStops");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		double price = Double.parseDouble(request.getParameter("price"));
		Flight newFlight = new Flight(flightName, flightNumber, source, destination, noOfStops, date, time, price);
		flightDao.insertFlight(newFlight);
		response.sendRedirect("list");
	}

	private void updateFlight(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		int flightId = Integer.parseInt(request.getParameter("flightId"));
		String flightName = request.getParameter("flightName");
		String flightNumber = request.getParameter("flightNumber");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String noOfStops = request.getParameter("noOfStops");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		double price = Double.parseDouble(request.getParameter("price"));

		Flight flight = new Flight(flightId, flightName, flightNumber, source, destination, noOfStops, date, time,
				price);
		flightDao.updateFlight(flight);

		response.sendRedirect("list");
	}

	public void searchFlightById(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "airlinereservationsystem";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "P9637333109k@";
		Statement st = null;
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
			System.out.println("connected!.....");
			String flightId = request.getParameter("flightId");
			System.out.println(flightId);
			ArrayList al = null;
			// Flight flight = null;
			ArrayList flightList = new ArrayList<>();
			String query = "select * from flight";
			if (flightId != null && !flightId.equals("")) {
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

	private void deleteFlight(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		System.out.println(request.getParameter("flightId"));
		try {
			int flightId = Integer.parseInt(request.getParameter("flightId"));
			flightDao.deleteFlight(flightId);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("list");
	}

}
