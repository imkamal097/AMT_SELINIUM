package collectionnnn;
import java.util.*;
import java.util.ArrayList;
   

public class phonemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<phoneAL> al=new ArrayList<>();
       phoneAL[] arr=new phoneAL[10];
       arr[0]=new phoneAL("Redmi","A30",13000,8);
       arr[1]=new phoneAL("Realme","P30",14000,4);
       arr[2]=new phoneAL("Oppo","A30",15000,6);
       arr[3]=new phoneAL("Vivo","A30",16000,6);
       arr[4]=new phoneAL("Iqoo","A30",16000,6);
       arr[5]=new phoneAL("Nothing","A30",17000,12);
       arr[5]=new phoneAL("Poco","A30",18000,8);
       arr[6]=new phoneAL("Blackberry","A30",19000,12);
       arr[7]=new phoneAL("infinix","A30",23000,8);
       arr[8]=new phoneAL("Xiomi","A30",23000,8);
       arr[9]=new phoneAL("MI","A30",23000,8);
    	    
       
       al.add(arr[0]);
       al.add(arr[1]);
       al.add(arr[3]);
       al.add(arr[4]);
       al.add(arr[5]);
       al.add(arr[6]);
       al.add(arr[7]);
       al.add(arr[8]);
       al.add(arr[9]);
       
       String s=sc.next();
       
      int mp=sc.nextInt();
      int mip=sc.nextInt();
      
      int r=sc.nextInt();
      int t=sc.nextInt();
      
       sc.close();
       
       
       phonefun.Findi(al,s);
       phonefun.between(al,mp,mip);
       phonefun.spec(al,t,r);
      //System.out.println(al.get(0));
       
       
    	   
       }
       
	}

