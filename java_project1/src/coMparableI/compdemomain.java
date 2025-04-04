package coMparableI;

import java.util.ArrayList;
import java.util.Collections;

public class compdemomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<democomp> d=new ArrayList<>();
        d.add(new democomp("kamal",1,28));
        d.add(new democomp("kavin",2,22));
        d.add(new democomp("Akash",3,25));
        //dempcomp.display(d);
        for(democomp di:d) {
        	System.out.println(di.id+" "+di.name+" "+di.age);
        }
      System.out.println("\nAfter sort\n");
        
        Collections.sort(d);
        for(democomp di:d) {
        	System.out.println(di.id+" "+di.name+" "+di.age);
        }
        
        
        Collections.sort(d,new Namecheck());
        System.out.println();                           //for comparator
        for(democomp di:d) {
        	System.out.println(di.id+" "+di.name+" "+di.age);
        }
	}

}
