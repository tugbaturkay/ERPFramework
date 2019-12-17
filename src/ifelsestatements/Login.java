package ifelsestatements;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome,please enter your age:");
		int age=input.nextInt();
		if (age>0 && age<=120) {
			System.out.println("valid age");
			if (age>=21) {
				System.out.println("Welcome to Club");
			}
			else {
				System.out.println("Not enough age!");
				int difference = 21-age;
				System.out.println("please come back after "  +  difference  +  " years");
			}
		}
			else {
				System.out.println("invalid age");
			}
	
	
				
	}

}
