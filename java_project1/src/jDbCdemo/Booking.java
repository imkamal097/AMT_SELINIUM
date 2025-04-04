package jDbCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Booking {
	 String rid;
	 String pickup;
	String destination;
	 int totalseats;
	 int remseats;
	 int cost;
	 public Booking(String rid, String pickup, String destination, int totalseats, int remseats, int cost) {
		super();
		this.rid = rid;
		this.pickup = pickup;
		this.destination = destination;
		this.totalseats = totalseats;
		this.remseats = remseats;
		this.cost = cost;
	} 
	
}
