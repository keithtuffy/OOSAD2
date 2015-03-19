package week7.bankaccountfacade;

public class Payee {

	private BankAccount bankAccount;
	private int ID;

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public Payee(int ID, BankAccount ba) {
		this.ID = ID;
		this.bankAccount = ba;
	
	}

	public BankAccount getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(BankAccount BankAccount) {
		this.bankAccount = BankAccount;
	}

	public Payee() {
		// TODO - implement Payee.Payee
		throw new UnsupportedOperationException();
	}

}
