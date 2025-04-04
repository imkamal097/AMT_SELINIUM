package exceptions;
import java.io.*;
import java.util.ArrayList;
public class al {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> l=new ArrayList<>();
        l.add("Apple");
        l.add("Orange");
        l.add("grape");
        l.add("grape");
        l.remove(0);
       // l.remove("grape");
		l.add(0,"Mango");
		
        System.out.println(l);
	}

}
