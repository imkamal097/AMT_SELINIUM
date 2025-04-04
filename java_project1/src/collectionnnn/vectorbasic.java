package collectionnnn;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vectorbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> al1=new ArrayList<>();
       List<String> vec=new Vector<String>();
       vec.add("Java");
       vec.add("Databse");
       vec.add("Git");
       System.out.println(vec);
       vec.remove("Git");
       System.out.println("After removing: "+vec);
	}
}
