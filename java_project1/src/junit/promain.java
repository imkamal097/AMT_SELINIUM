package junit;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
public class promain {
	
    static HashMap<Integer,Product> hmg=new HashMap<>();//global hashmap

	 public static void main(String[] args) {
	  	// TODO Auto-generated method stub
        Product p[]=new Product[10];
        HashMap<Integer,Product> hm=new HashMap<>();
        
        p[0]=new Product(1,"TV",15000,"MI", 100);
        p[1]=new Product(2,"Mobile",17000,"Iqoo",10);
        p[2]=new Product(3,"Headset",19000,"boat",51);
        p[3]=new Product(4,"Laptop",12000,"HP",18);
        p[4]=new Product(5,"Tab",11000,"MI",111);
        p[5]=new Product(6,"watch",25000,"sonata",152);
        p[6]=new Product(7,"shirt",25000,"otto",71);
        p[7]=new Product(8,"T-shirt",19000,"Polo",981);
        p[8]=new Product(9,"mouse",16000,"Dell",41);
        p[9]=new Product(10,"Speaker",17000,"Boat",31);
       
        	hm.put(p[0].productID,p[0]);
        	hm.put(p[1].productID,p[1]);
        	hm.put(p[2].productID,p[2]);
        	hm.put(p[3].productID,p[3]);
        	hm.put(p[4].productID,p[4]);
        	hm.put(p[5].productID,p[5]);
        	hm.put(p[6].productID,p[6]);
        	hm.put(p[7].productID,p[7]);
        	hm.put(p[8].productID,p[8]);
        	hm.put(p[9].productID,p[9]);
        	 
        	System.out.println("+------------+------------------------+----------+--------+----------+");
            System.out.println("| Product ID | Product Name           | Quantity | Brand  |Unit_price|");
            System.out.println("+------------+------------------------+----------+--------+----------+");
        	for(Map.Entry<Integer, Product> i:hm.entrySet()) {
        		Product pa=i.getValue();
        		System.out.printf("| %-10d | %-22s | %-8d | %-6s | %-8d |\n",pa.productID, pa.proname, pa.quantity, pa.brand,pa.price);  		
        	}
        	   System.out.println("+------------+------------------------+----------+--------+--------+");
        	  
        	   Hashfun.disp(hm);
	}

}
