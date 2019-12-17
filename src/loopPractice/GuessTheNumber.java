package loopPractice;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Random random=new Random();
		int randomNumber=random.nextInt(101);
		Scanner input=new Scanner(System.in);
		
		int guessNumber;
		do {
			System.out.println("Please guess the number");
			 guessNumber=input.nextInt();
		
		
		if(guessNumber>randomNumber) {
			System.out.println("Your guess is too high");
			
		}else if(guessNumber<randomNumber) {
			System.out.println("Your guess is too low");
			
		}else if(guessNumber==randomNumber) {
			System.out.println("CONGRATULATIONS");
			break;
	}
		}while(guessNumber!=randomNumber);
			
	
	}
	}


