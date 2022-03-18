package com.cybage.dao;

import java.util.*;

import com.cybage.model.Flight;

import java.io.PrintWriter;
import java.sql.*;

public class FlightDao {
	private String jdbcURL = "jdbc:mysql://localhost:3306/airlinereservationsystem?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "P9637333109k@";

	private static final String INSERT_FLIGHT_SQL = "insert into flight(flightId,flightName,flightNumber ,source, destination, noOfStops, date, time, price) values (?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_FLIGHT_BY_ID = "select flightId,flightName,flightNumber ,source, destination, noOfStops, date, time, price  from flight where flightId =?";
	private static final String SELECT_ALL_FLIGHTS = "select * from flight";
	private static final String DELETE_FLIGHT_SQL = "delete from flight where flightId = ?;";
	private static final String UPDATE_FLIGHT_SQL = "update flight set flightName = ?,flightNumber= ?,source = ?, destination = ?, noOfStops=?, date = ? ,time = ?, price = ? where flightId = ?";

	public FlightDao() {
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void insertFlight(Flight flight) throws SQLException {
		System.out.println(INSERT_FLIGHT_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FLIGHT_SQL)) {
			preparedStatement.setInt(1, flight.getFlightId());
			preparedStatement.setString(2, flight.getFlightName());
			preparedStatement.setString(3, flight.getFlightNumber());
			preparedStatement.setString(4, flight.getSource());
			preparedStatement.setString(5, flight.getDestination());
			preparedStatement.setString(6, flight.getNoOfStops());
			preparedStatement.setString(7, flight.getDate());
			preparedStatement.setString(8, flight.getTime());
			preparedStatement.setDouble(9, flight.getPrice());

			preparedStatement.executeUpdate();

			connection.close();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public List<Flight> selectAllFlights() {
		Statement st;
		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Flight> flight = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FLIGHTS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				st = connection.createStatement();
				Flight flight1 = new Flight();
				flight1.setFlightId(rs.getInt("flightId"));
				flight1.setFlightName(rs.getString("flightName"));
				flight1.setFlightNumber(rs.getString("flightNumber"));
				flight1.setSource(rs.getString("source"));
				flight1.setDestination(rs.getString("destination"));
				flight1.setNoOfStops(rs.getString("noOfStops"));
				flight1.setDate(rs.getString("date"));
				flight1.setTime(rs.getString("time"));
				flight1.setPrice(rs.getDouble("price"));

				flight.add(flight1);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return flight;
	}

	public boolean deleteFlight(int flightId) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_FLIGHT_SQL);) {
			statement.setInt(1, flightId);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	public Flight selectFlight(int flightId) {
		Flight flight = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FLIGHT_BY_ID);) {
			preparedStatement.setInt(1, flightId);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String flightName = rs.getString("flightName");
				String flightNumber = rs.getString("flightNumber");
				String source = rs.getString("source");
				String destination = rs.getString("destination");
				String noOfStops = rs.getString("noOfStops");
				String date = rs.getString("date");
				String time = rs.getString("time");
				Double price = rs.getDouble("price");

				flight = new Flight(flightName, flightNumber, source, destination, noOfStops, date, time, price);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return flight;
	}

	public boolean updateFlight(Flight flight) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_FLIGHT_SQL);) {
			statement.setString(1, flight.getFlightName());
			statement.setString(2, flight.getFlightNumber());
			statement.setString(3, flight.getSource());
			statement.setString(4, flight.getDestination());
			statement.setString(5, flight.getNoOfStops());
			statement.setString(6, flight.getDate());
			statement.setString(7, flight.getTime());
			statement.setDouble(8, flight.getPrice());
			statement.setInt(9, flight.getFlightId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	public List<Flight> searchFlightByDepartureTime(String time) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("connected!.....");
			System.out.println(time);
			ArrayList al = null;
			ArrayList flightList = new ArrayList<>();
			String query = "select * from flight";
			if (time != null && !time.equals("")) {
				query = "select * from flight where time='" + time + "' ";
			}
			System.out.println("query " + query);
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				al = new ArrayList();
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
			return flightList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public List<Flight> searchFlightByFlightName(String flightName) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("connected!.....");
			System.out.println(flightName);
			ArrayList al = null;
			ArrayList flightList = new ArrayList<>();
			String query = "select * from flight";
			if (flightName != null && !flightName.equals("")) {
				query = "select * from flight where flightName='" + flightName + "' ";
			}
			System.out.println("query " + query);
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				al = new ArrayList();
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
			return flightList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Flight> searchFlightBySource(String source) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("connected!.....");
			System.out.println(source);
			ArrayList al = null;
			ArrayList flightList = new ArrayList<>();
			String query = "select * from flight";
			if (source != null && !source.equals("")) {
				query = "select * from flight where source='" + source + "' ";
			}
			System.out.println("query " + query);
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				al = new ArrayList();
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
			return flightList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public List<Flight> searchFlightByDestination(String destination) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("connected!.....");
			System.out.println(destination);
			ArrayList al = null;
			ArrayList flightList = new ArrayList<>();
			String query = "select * from flight";
			if (destination != null && !destination.equals("")) {
				query = "select * from flight where destination='" + destination + "' ";
			}
			System.out.println("query " + query);
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				al = new ArrayList();
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
			return flightList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Flight> searchFlightByDate(String date) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("connected!.....");
			System.out.println(date);
			ArrayList al = null;
			ArrayList flightList = new ArrayList<>();
			String query = "select * from flight";
			if (date != null && !date.equals("")) {
				query = "select * from flight where date='" + date + "' ";
			}
			System.out.println("query " + query);
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				al = new ArrayList();
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
			return flightList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}