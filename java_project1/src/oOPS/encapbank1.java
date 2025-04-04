package oOPS;

public class encapbank1 {
    private String name;
    private int accno,balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", accno=" + accno + ", balance=" + balance + "]";
	}

    
}
