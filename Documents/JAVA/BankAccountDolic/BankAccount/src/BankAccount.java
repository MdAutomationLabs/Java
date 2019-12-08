//Mirzet Dolic
public class BankAccount {
	private double balance;
	
	
	public BankAccount(double balance){
		setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double deposit(double amount){
		double deposit = balance + amount;
		return balance = deposit;		
	}
	public double withdraw(double amount){
		double withdraw = balance - amount;
		return balance =  withdraw;
	}
	

}
