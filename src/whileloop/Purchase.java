package whileloop;

import java.util.Scanner;

public class Purchase {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int balance=1500;
		int transactionAmount;
		
		while(balance>0) {
			System.out.println("Enter the transaction amount:");
			transactionAmount=input.nextInt();
			
			if(balance<transactionAmount) {
				System.out.println("transaction amount is too high");
				break;	
			}
		
			balance=balance-transactionAmount;
		}
		if(balance==0) {
			System.out.println("You're broke");
		}
		
		System.out.println("Your balance:" + balance);
		
	}

}
