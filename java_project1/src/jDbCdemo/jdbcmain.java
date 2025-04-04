package jDbCdemo;
import java.sql.SQLException;
import java.util.HashMap;

public class jdbcmain {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	HashMap<Integer,student>hm =new HashMap<>();
    hm.put(1, new student(1,"kamal",60,70,65.00f));
    hm.put(2,new student(2,"vimal",50,60,55.00f));
    hm.put(3, new student(3,"ramesh",70,70,75.00f));
    hm.put(3, new student(4,"suresh",80,80,80.00f));
    //jdbcmethod.insert(hm);
    jdbcmethod.calculate(hm);
    jdbcmethod.disp();
    
}
}
