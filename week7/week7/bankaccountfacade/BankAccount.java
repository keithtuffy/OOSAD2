package week7.bankaccountfacade;

public class BankAccount {

	private int ID;
	private double balance;

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(int ID, double balance) {
		this.ID = ID;
		this.balance = balance;
	}

	public BankAccount() {

	}

}
