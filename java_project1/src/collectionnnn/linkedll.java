package collectionnnn;

import java.util.LinkedList;

public class linkedll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<String> p1=new LinkedList<>();
       p1.add("red");
       p1.add("Yellow");
       p1.add("green");
       p1.add(1,"violet");
       
       System.out.println(p1);
       System.out.println("First : "+p1.getFirst());
       System.out.println("Last : "+p1.getLast());
       p1.removeFirst();
       p1.removeLast();
	}

}
