package week7.bankaccountfacade;

public class BankFacade {


	public static void makePayment(Customer cus, Payee pay, double amount) {

		cus.bankAccount.setBalance(cus.bankAccount.getBalance() - amount);
		System.out.println("Debiting " + amount + " from customer\n New Balance for customer" + cus.bankAccount.getBalance());

		pay.bankAccount.setBalance(pay.bankAccount.getBalance() + amount);
		System.out.println("Crediting " + amount + " to payee\n New Balance for payee" + pay.bankAccount.getBalance());

	
	}





}
