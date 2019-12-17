package switchstatements;

import java.util.Scanner;

public class KnowledgeValidator {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Print enter your grade");
		String letter=input.nextLine();
		
		letter=letter.toUpperCase();
		
		if (letter.length()>1) {
			System.out.println("Invalid grade");
		}
		
		else {
		
		switch(letter) {
		case "A":
			System.out.println("Great");
			break;
		case"B":
			System.out.println("Good job");
			break;
		case"C":
			System.out.println("well");
			break;
		case "D":
			System.out.println("work harder");
			break;
		case "F":
			System.out.println("failed");
			break;
			default:
				System.out.println("Invalid grade");
			
		}
}
		
		
		
		
	}

}
