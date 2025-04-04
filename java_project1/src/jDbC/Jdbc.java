package jDbC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
     public static void main(String args[] ) throws SQLException, ClassNotFoundException{
    	 String jdbcurl="jdbc:mysql://localhost:3306/mydb1"; //database name and url
    	 String jdbcuname="root";
    	 String jdbcpswd="Password@12"; //sql workbench password
    	 
    	 //load the jdbc driver
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 //establish the connection
    	 Connection con  =DriverManager.getConnection(jdbcurl,jdbcuname,jdbcpswd);
    	 //create the connection
    	 Statement stmt=con.createStatement();
    	 //execute the query
    	 String q="select * from student"; //student table
    	 
    	 
    	 
    	 
    	 // String q1="select * from employee" //employee table
//    	 String q2="insert into student values(?,?,?,?);";
//    	 PreparedStatement pst=con.prepareStatement(q2);
//    	 pst.setInt(1,100);
//    	 pst.setString(2,"Ajith");
//    	 pst.setInt(3,100);
//    	 pst.setInt(4,100);
    	 //int res=pst.executeUpdate();                    //update data into query
//    	 if(res > 0) {
//    		 System.out.println("Data Updated");
//    	 }
    	 
    	 
//    	 String q3="delete from student where sid=?;";
//    	 PreparedStatement pst1=con.prepareStatement(q3);
//    	 pst1.setInt(1, 100);                             //delete the name by id
//    	 int res1=pst1.executeUpdate();
    	 
    	 
    	 String upd="update student set sid=? where marks=80";
    	 PreparedStatement pst2=con.prepareStatement(upd);
    	 pst2.setInt(1,100);
    	 pst2.setInt(2, 88);
    	 
    	 ResultSet rs=stmt.executeQuery(q);
    	 while(rs.next()) {
    		 int id=rs.getInt("sid");
    		 String n=rs.getString("name");
    		 System.out.println(id+" "+n);
    	 }
    	 con.close();
     }
}
