package com.cybage.model;

public class Flight {
	private int flightId;
	private String flightName;
	private String flightNumber;
	private String source;
	private String destination;
	private String noOfStops;
	private String  date;
	private String time;
	private Double price;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(int flightId, String flightName, String flightNumber, String source, String destination,
			String noOfStops, String date, String time, Double price) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.noOfStops = noOfStops;
		this.date = date;
		this.time = time;
		this.price = price;
	}



	public Flight(String flightName, String flightNumber, String source, String destination, String noOfStops,
			String date, String time, Double price) {
		super();
		this.flightName = flightName;
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.noOfStops = noOfStops;
		this.date = date;
		this.time = time;
		this.price = price;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getNoOfStops() {
		return noOfStops;
	}

	public void setNoOfStops(String noOfStops) {
		this.noOfStops = noOfStops;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", flightNumber=" + flightNumber
				+ ", source=" + source + ", destination=" + destination + ", noOfStops=" + noOfStops + ", date=" + date
				+ ", time=" + time + ", price=" + price + "]";
	}

	
	

	
	
}
