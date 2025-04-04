package collectionnnn;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashstumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,hashstud> hm=new HashMap<Integer,hashstud>();
       hashstud h=new hashstud("Sanjay",1,20);
       hashstud h1=new hashstud("Deepak",2,23);
       hashstud h3=new hashstud("kabil",3,25);
       
       hm.put(1, h);
       hm.put(2, h1);
       hm.put(3, h3);
       System.out.println("\nAfter constructor");
       System.out.println();
       for(Entry<Integer, hashstud> i: hm.entrySet()) {
    	   hashstud s=i.getValue();
    	   System.out.println(s.name+"'s ID is "+s.id+" and his age is "+s.age);
    	   System.out.println();
       }
       
	}

}
