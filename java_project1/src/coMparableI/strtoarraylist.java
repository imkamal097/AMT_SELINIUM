package coMparableI;

import java.util.ArrayList;
public class strtoarraylist {
           public static void main(String args[]) {
        	   String s="Hello world Hi";
        	   ArrayList<String> l=new ArrayList<>();
        	   StringBuilder sb=new StringBuilder(s);
        	   StringBuilder sb1=new StringBuilder();
        	   for(char ch: s.toCharArray()) {
        		   if(ch != ' '){
        			   sb1.append(ch);
        		   }
        		   else if(ch == ' ') {
        			   sb1.append(ch);
        		   }
        		   
        		   l.add(sb1.toString()); 
        	   }
        	   System.out.println(l.get(l.size()-1));
        	   
           }
}
