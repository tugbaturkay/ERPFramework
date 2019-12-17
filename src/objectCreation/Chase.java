package objectCreation;

public class Chase {
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.accountNumber=123455;
		b1.balance=34.99;
		b1.cardHolder="James Bond";
		b1.type="checking";
		
		b1.info();
		b1.deposit(10000);
		b1.info();
	}

}
