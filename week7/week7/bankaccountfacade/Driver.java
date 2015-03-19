package week7.bankaccountfacade;

public class Driver {

	public static void main(String args[]) {
	BankAcount b1 = new BankAccount(1, 20000);	
	BankAcount b2 = new BankAccount(2, 10000);

	Customer cus = new Customer(12, b1);
	Payee pay = new Payee(69, b2);

	BankFacade.makePayment(cus, pay, 10000);

	
	
	}

	public static void main() {
		// TODO - implement Driver.main
		throw new UnsupportedOperationException();
	}


}
