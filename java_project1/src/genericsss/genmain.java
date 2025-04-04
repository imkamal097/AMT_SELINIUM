package genericsss;

public class genmain {
   public static void main(String args[]) {
	   basic<Integer> i=new basic<>();
	   i.setData(200);
	   System.out.println(i.getData());
	   
	   basic<String> s=new basic<>();
	   s.setData("Hello");
	   System.out.println(s.getData());
   }
}
