package objectCreation;

public class BankAccount {
	String type;
	int accountNumber;
	double balance;
	String cardHolder;
	
	public void deposit(double amount) {
		System.out.println(amount +" is deposited to your account" );
		balance+=amount;
	}
	public void transfer(double amount) {
		System.out.println(amount +" is trasferred from your account" );
		balance-=amount;
	}
	public void info() {
		System.out.println("\nName: "+ cardHolder);
		System.out.println("Balance: "+ balance);
		System.out.println("Type: "+ type);
		System.out.println("Account Number: "+ accountNumber);
		
	}

}
