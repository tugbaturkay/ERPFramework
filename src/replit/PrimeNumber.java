package replit;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number=input.nextInt();
		int counter=0;
		for(int i=2; i<10;i++) {
			if(number%i==0){
				counter++;
			}
		
		}
		if(counter==0) {
			System.out.println(number + " is prime number!");
		}
			  else{
			        System.out.println(number + " is not prime number!");
			      }
	    
	}

}
