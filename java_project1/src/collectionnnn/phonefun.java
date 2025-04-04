package collectionnnn;

import java.util.ArrayList;

public class phonefun {
	public static void Findi(ArrayList<phoneAL> al,String s) {
		for(phoneAL i:al) { 
			if(i.brand.equals(s)) {
				System.out.println(i.brand+" "+i.model+" "+i.price+" "+i.RAM);
				System.out.println();
			}
		}
	}
	public static void between(ArrayList<phoneAL> al,int mp,int mip) {
		for(phoneAL i:al) { 
			if(i.price >= mp && mip > i.price) {
				System.out.println(i.brand+" "+i.model+" "+i.price+" "+i.RAM);
				System.out.println();
			}
		}
	}
   
	public static void spec(ArrayList<phoneAL> al,int t,int r) {
		for(phoneAL i:al) { 
			if(i.RAM >= r && i.price<=r) {
				System.out.println(i.brand+" "+i.model+" "+i.price+" "+i.RAM);
			}
		}
	}

}
