package nestedloops;

import java.util.Random;
import java.util.Scanner;

public class GeneratedNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a random number");
		int randomNumber=input.nextInt();
		int counter=0;
		if (randomNumber>0 && randomNumber<100) {
			System.out.println(randomNumber);
			//int counter;
			for (int i=0;i<100;i++) {
                  //System.out.println(i);
				Random randomNumber2 =new Random();
				int x = randomNumber2.nextInt(100);
				if (randomNumber==x) {
					counter++;
					break;
				}
				System.out.println(counter+ "attempts");
			}
		}		
	}

}
