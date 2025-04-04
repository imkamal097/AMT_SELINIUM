package jDbCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class datfunc {
	static HashMap<String,Booking> hm=new HashMap<>();
	//static HashMap<String,busroute> hm2=new HashMap<>();
	 public static Connection connect() throws ClassNotFoundException, SQLException{
	    String jdbcurl="jdbc:mysql://localhost:3306/mydb1"; //database name and url
	   	 String jdbcuname="root";
	   	 String jdbcpswd="Password@12"; //sql workbench password
	  
	   	 Class.forName("com.mysql.cj.jdbc.Driver");
	   	 Connection con  =DriverManager.getConnection(jdbcurl,jdbcuname,jdbcpswd);
	   	  return con;
	    }
	 
	 public static void getData() throws ClassNotFoundException, SQLException {//assign table values in hm
	    	String fin="select * from bus";
	    	PreparedStatement pst1=connect().prepareStatement(fin);
	    	ResultSet rs=pst1.executeQuery(fin);
	    	while(rs.next()) {
	    		hm.put(rs.getString(1),new Booking(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));
	    	}
	    }
	 public static void PutData(String rid,int count )throws ClassNotFoundException, SQLException {
	    	Connection con1  =jdbcmethod.connect();
	    	Statement stmt=con1.createStatement();
	    	String s="insert into booking values(?,?,?,?)";
	    	PreparedStatement pst12=connect().prepareStatement(s);
	    	Booking br=hm.get(rid);
	    	if(count < br.remseats) {
	    		pst12.setString(1,"1");
	    		pst12.setString(2,rid);
	    		pst12.setInt(3,count);
	    		pst12.setInt(4, count*br.cost);
	            pst12.execute();
	    	}
	    	ProcessData(count,rid);
	    }
	 public static void Input() throws ClassNotFoundException, SQLException
		{
			Scanner sc=new Scanner(System.in);
			String rid=sc.next();
			int count=sc.nextInt();
			PutData(rid,count);
		}
	 public static void ProcessData(int count,String rid) throws ClassNotFoundException, SQLException {
		 
		    Connection con123  =jdbcmethod.connect();
	    	Booking hr=hm.get(rid);
	    	String str="update bus set remseats=? where rid=? ";
	    	PreparedStatement pst3=connect().prepareStatement(str);
	    	pst3.setInt(1, hr.remseats-count);
	    	pst3.setString(2,hr.rid);
	    	System.out.println("Remaining seats after booking is updated in database");	
	    	pst3.execute();	    	
	    	datfunc.Total();
	    }
	 

	public static void Total() throws ClassNotFoundException, SQLException {
		Connection con1234  =jdbcmethod.connect();
		Statement stmt=con1234.createStatement();
    	String str1="select sum(totalamount) from booking";
    	ResultSet rst1=stmt.executeQuery(str1);
    	while(rst1.next()) {
    		System.out.println("Grand total: "+rst1.getInt(1));
    	}
	}
	 
}
