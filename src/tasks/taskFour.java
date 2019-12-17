package tasks;

import java.util.Random;
import java.util.Scanner;

public class taskFour {
	public static void main(String[] args) {
		Random randomNumber=new Random();
		int i=randomNumber.nextInt(10);
		System.out.println("Please guess a number between 0-10");
	Scanner input=new Scanner(System.in);
		
		int j=input.nextInt();
		
		if(j<i) {
			System.out.println("Your guess is too low");
		}

		else if (i<j) {
			System.out.println("Your guess is too high");
		}
		else {
			System.out.println("Congratulations! You got it");
			
		};
		System.out.println("secret number was" + i);
				
		
		
		
	}
	

}
