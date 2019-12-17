package switchstatements;

import java.util.Scanner;

public class AgeValidator {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=input.nextInt();
		//make sure entered age is only between 0-120
		
		if (age>=0 && age<=120) {
		
		switch (age) {
		
		case 16:
			System.out.println("almost done with high school");
			break;
		case 24:
			System.out.println("almost done with unv");
			break;
			default:
				System.out.println("keep living");
		
		
		}
		}
		else {
			System.out.println("Invalid age");
		}
		
	}

}
