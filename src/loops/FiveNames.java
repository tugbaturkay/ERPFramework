package loops;

import java.util.Scanner;
//Write a program that asks from 5 names from the user and print each name

public class FiveNames {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	
		for(int i=1; i<=5; i++) {
			System.out.println("Please enter your name"+ i +":");
			String name=input.nextLine();
			System.out.println(name);
		}
		
		
	}

}
