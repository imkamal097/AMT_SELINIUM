package oOPS;

public class acc_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       bank_acc data=new bank_acc(1234,"Murali",5000);
       
       data.disp();
       data.deposit(10000);
       data.disp();
       data.withdraw(5000);
       data.disp();
	}

}
