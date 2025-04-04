package jDbCdemo;

public class busroute {
	   String bookingid;
	   String rid;
	   int noofseats;
	  int totalamount;
	public int remseats;
	public int cost;
	static int value;
	  
	public busroute(String bookingid, String rid, int noofseats, int totalamount) {
		super();
		this.bookingid = bookingid;
		this.rid = rid;
		this.noofseats = noofseats; 
		this.totalamount = totalamount;
	}
	  
}
