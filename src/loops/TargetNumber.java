package loops;

import java.util.Random;
import java.util.Scanner;

public class TargetNumber {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Random random=new Random();
	int number=random.nextInt(100);
	System.out.println(number);
	//int guessNumber=input.nextInt();
	int attempts=0;
	System.out.println("Please enter a number");
	for (int i=0;i<100;i++) {
		
		
		attempts++;
		if (i==number) {
			System.out.println("target found");
			break;
				}
	}
	System.out.println("Number of attempts is:"+ attempts);
}
}
