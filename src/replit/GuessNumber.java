package replit;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		int randomNumber=random.nextInt(100);
		System.out.println(randomNumber);
		int guessNumber;
		do {
			System.out.println("Please guess a number");
			guessNumber=input.nextInt();
			System.out.println(guessNumber);
			if(guessNumber<randomNumber) {
				System.out.println("it is too low");
			}else if (guessNumber>randomNumber) {
				System.out.println("it is too high");
			}
					
		}while(guessNumber!=randomNumber);
			
		}
		
	

}

