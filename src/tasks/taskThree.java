package tasks;

import java.util.Random;


public class taskThree {
	public static void main(String[] args) {
		
		
		Random number=new Random();
		int i=number.nextInt(11);
		System.out.println(i);
       
		if (i%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		
		
	}

}
