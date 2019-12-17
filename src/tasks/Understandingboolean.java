package tasks;

import java.util.Scanner;

public class Understandingboolean {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		boolean currentStudent;
		System.out.println("Please enter your name:");
		name=input.nextLine();
		System.out.println("Are you a student currently?\nyes/no)");
		String response=input.nextLine();
		if (response.equals("yes")) {
			currentStudent=true;
		}
		else {
			currentStudent=false;
		}
			System.out.println("Name:" + name);
			System.out.println("Currentstudent:" + currentStudent);
		if (currentStudent) {
			System.out.println(name + " You Rock");
		}
		
	}

}
