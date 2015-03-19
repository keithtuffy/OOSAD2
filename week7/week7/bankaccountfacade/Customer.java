package week7.bankaccountfacade;

public class Customer {

	private int ID;
	private BankAccount bankAccount;

	public Customer(int ID, BankAccount ba) {
		this.ID = ID;
		this.bankAccount = ba;
	}
	

	public BankAccount getBankAccount() {
		return this.BankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Customer() {
		
	}

}
