package coMparableI;
import java.io.*;
public class noofword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        StringBuilder sb=new StringBuilder();
        String s="I work with Mphasis Bangalore";
        sb.append(s);
        int c=0;
        //int length=sb.length();
        for(char ch: s.toCharArray()) {
        	if(ch == ' ') {
        		c++;
        	}
        }
        System.out.println("Number of words: "+(c+1));
	}

}
