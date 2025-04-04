package oOPS;

public class bank_acc {
		int accno;
		String name;
		int balance;
		
		public bank_acc() {
			
		}

		public bank_acc(int accno,String name,int balance){           //constructor
			this.accno=accno;
			this.name=name;
			this.balance=balance;
		}
		
		public void disp() {
			System.out.println("Account number: "+accno);
			System.out.println("Name "+name);
			System.out.println("Available balance: \n"+balance);
		}
		
		public void deposit(int deposit) {
			System.out.println("\nYour updated balance is \n"+(balance+=deposit));
		}
		public void withdraw(int with) {
			if(with <= balance) {
				balance-=with;
				System.out.println("\nPlease take your cash....\n");
			}
			else {
				System.out.println("Please enter the withdraw amount within the balance amount\n");
			}
		}
		
	}

