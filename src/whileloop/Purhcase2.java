package whileloop;

import java.util.Scanner;

public class Purhcase2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int balance=1500;
		int transactionAmount;
		String itemName;
		
		while(balance>0) {
			System.out.println("Enter the transaction amount:");
			transactionAmount=input.nextInt();
			input.nextLine();
			System.out.println("Enter item name:");
			itemName=input.nextLine();
	        if(itemName.equalsIgnoreCase("AK-47")) {
	        	System.out.println("Illegal item");
	        	break;
	        }
			if(balance<transactionAmount) {
				System.out.println("transaction amount is too high.Try lower price");
				continue;	
			}
			balance=balance-transactionAmount;
			System.out.println(itemName + " purchased successfully");
		}
		if(balance==0) {
			System.out.println("You're broke");
		}
		
		System.out.println("Your balance:" + balance);
		
	}

}



