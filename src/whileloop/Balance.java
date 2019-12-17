package whileloop;

import java.util.Scanner;

public class Balance {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int balance=1500;
		
		
		while(balance>0){
			System.out.println("Please enter the item name");
			String itemName=input.nextLine();
			if (itemName.equals("AK-87")) {
				System.out.println("Illegal item");
				break;
				
			}else {
				System.out.println("Please enter the amount");
				int amount=input.nextInt();
				if (amount>balance) {
					 System.out.println("amount is too high");
					 continue;
				 }
				 balance=balance-amount;
				 
			}
			if(balance==0) {
				System.out.println("You are broke!");
			}
			
			
				
				
			}
			
			
			
			
		
			
			 
	}

}
