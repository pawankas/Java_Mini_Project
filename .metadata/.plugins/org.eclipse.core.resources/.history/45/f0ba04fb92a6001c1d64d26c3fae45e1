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
			case "/SearchByTime":
				searchFlightByDepartureTime(request, response);
				break;
			case "/SearchByName":
				searchFlightByFlightName(request, response);
				break;
			case "/SearchBySource":
				searchFlightBySource(request, response);
				break;
			case "/SearchByDestination":
				searchFlightByDestination(request, response);
				break;
			case "/SearchByDate":
				searchFlightByDate(request, response);
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

	public void searchFlightByDepartureTime(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String time = request.getParameter("time");
			List<Flight> flightList = flightDao.searchFlightByDepartureTime(time);
			request.setAttribute("flightList", flightList);
			RequestDispatcher view = request.getRequestDispatcher("SearchView.jsp");
			view.forward(request, response);
	}
	
	public void searchFlightBySource(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String source = request.getParameter("source");
			List<Flight> flightList = flightDao.searchFlightBySource(source);
			request.setAttribute("flightList", flightList);
			RequestDispatcher view = request.getRequestDispatcher("SearchView.jsp");
			view.forward(request, response);
	}
	
	public void searchFlightByDestination(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String destination = request.getParameter("destination");
			List<Flight> flightList = flightDao.searchFlightByDestination(destination);
			request.setAttribute("flightList", flightList);
			RequestDispatcher view = request.getRequestDispatcher("SearchView.jsp");
			view.forward(request, response);
	}
	
	public void searchFlightByDate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String date = request.getParameter("date");
			List<Flight> flightList = flightDao.searchFlightByDate(date);
			request.setAttribute("flightList", flightList);
			RequestDispatcher view = request.getRequestDispatcher("SearchView.jsp");
			view.forward(request, response);
	}
	
	public void searchFlightByFlightName(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String flightName = request.getParameter("flightName");
			List<Flight> flightList = flightDao.searchFlightByFlightName(flightName);
			request.setAttribute("flightList", flightList);
			RequestDispatcher view = request.getRequestDispatcher("SearchView.jsp");
			view.forward(request, response);
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

