package loops;

import java.util.Scanner;

public class RacistPerson {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name:");
		
		for (; ;) {
			String name=input.nextLine();
			if (name.equalsIgnoreCase("James")) {
				continue;
			
		}
			System.out.println("Good Job, " + name);
		}
		
	
	}
}

