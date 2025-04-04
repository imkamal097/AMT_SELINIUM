package oOPS;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PolymorParent p=new citybank();
    System.out.println("Interest of Citybank: "+p.getInterest());
    p=new HDFC();
    System.out.println("Interest of HDFC: "+p.getInterest());
	}

}
