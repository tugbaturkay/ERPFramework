package replit;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int balance=100;
		int items=3;
		int itemsBought=0;
		while(true) {
			System.out.print("Enter cost of item:");
			int cost=input.nextInt();
			
			if(cost>balance) {
				System.out.println("You can't spend more than $100");
			}
		else {
			System.out.println("You spent "+"$"+cost+" so far");
			balance=balance-cost;
			items--;
			System.out.println("You may buy up to "+items+" items");
		}
			
			
		
			
		}
		
	
	}
}


