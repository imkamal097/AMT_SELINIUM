package jDbCdemo;

import java.security.KeyStore.Entry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class jdbcmethod {
    public static Connection connect() throws ClassNotFoundException, SQLException{
    	String jdbcurl="jdbc:mysql://localhost:3306/mydb1"; //database name and url
   	 String jdbcuname="root";
   	 String jdbcpswd="Password@12"; //sql workbench password
   	 
   	 //load the jdbc driver
   	 Class.forName("com.mysql.cj.jdbc.Driver"); 
   	 //establish the connection
   	 Connection con  =DriverManager.getConnection(jdbcurl,jdbcuname,jdbcpswd);
   	 //create the connection
   	 //Statement stmt=con.createStatement();
   	  return con;
    }
    
    public static void insert(HashMap<Integer,student> hm) throws SQLException, ClassNotFoundException {
    	  
    	Connection con  =jdbcmethod.connect();
    	for(java.util.Map.Entry<Integer, student> i: hm.entrySet()) {
    	String q2="insert into studentdet values(?,?,?,?,?)";
    	PreparedStatement pst=connect().prepareStatement(q2);
    	student s=i.getValue();
    	pst.setInt(1, s.sid);
    	pst.setString(2, s.sname);
    	pst.setInt(3,s.phy);
    	pst.setInt(4, s.chem);
    	pst.setInt(5,0);
    	pst.execute();   	        
   	
   	//inserting data into query
    	}
   		 System.out.println("Data Updated");
   	 
    }
    public static void disp() throws ClassNotFoundException, SQLException {
    	Connection con  =jdbcmethod.connect();
    	String fin="select * from studentdet";
    	Statement stmt=con.createStatement();
    	PreparedStatement pst1=connect().prepareStatement(fin);
    	ResultSet rs=pst1.executeQuery(fin);
    	while(rs.next()) {
    		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getFloat(5));
    	}
    
    }
    public static void calculate(HashMap<Integer,student> hm) throws ClassNotFoundException, SQLException {
    	Connection con  =jdbcmethod.connect();
    	String f="update studentdet set average =? where sid=?";
    	//Statement stmt1=con.createStatement();
    	PreparedStatement pst2=connect().prepareStatement(f);
    	for(Map.Entry<Integer,student> k: hm.entrySet()) {
    		student m=k.getValue();
    		pst2.setFloat(1, student.average(m.phy,m.chem));
    		pst2.setInt(2, m.sid);
    		pst2.execute();
  }
    	
    }

	
    
}
