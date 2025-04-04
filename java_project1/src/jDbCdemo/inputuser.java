package jDbCdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class inputuser {
  
  public static Connection connect() throws ClassNotFoundException, SQLException{
  	String jdbcurl="jdbc:mysql://localhost:3306/mydb1"; //database name and url
 	 String jdbcuname="root";
 	 String jdbcpswd="Password@12"; //sql workbench password
 	 Class.forName("com.mysql.cj.jdbc.Driver");
 	 Connection con  =DriverManager.getConnection(jdbcurl,jdbcuname,jdbcpswd);
 	  return con;
  }
	 public static void Disp() throws ClassNotFoundException, SQLException {
		 System.out.println("In display function.........."); 
	    	Connection con  =jdbcmethod.connect();
	    	String fin="select * from bus";
	    	PreparedStatement pst1=connect().prepareStatement(fin);
	    	ResultSet rs=pst1.executeQuery(fin);
	    	while(rs.next()) {
             System.out.println("Rid: "+rs.getString(1)+" From: "+rs.getString(2)+" To: "+rs.getString(3)+" Rem: "+rs.getInt(5)+" Cost: "+rs.getInt(6));	    	
	    	}
	    }
	 public static void sum() throws ClassNotFoundException, SQLException {
			Connection con1234  =jdbcmethod.connect();
			Statement stmt=con1234.createStatement();
	    	String str1="select sum(totalamount) from booking";
	    	PreparedStatement pst1234=connect().prepareStatement(str1);
	    	ResultSet rs=pst1234.executeQuery();
	    	while(rs.next()) {
	    		System.out.println("Grand total: "+rs.getInt(0));
	    	}
		}
	
  
  
}
