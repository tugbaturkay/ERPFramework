package tasks;

import java.util.Scanner;

public class tasktwo {
	public static void main(String[] args) {
		
		System.out.println("Please enter two double values:");
		
		Scanner input=new Scanner(System.in);
		double n1=input.nextDouble();
		double n2=input.nextDouble();
		String operator;
		
		System.out.println("Please choose your operator from below");
		System.out.println(" + , - , * , / ");
		operator=input.next();
		
		switch(operator) {
	
		case "+" :
			System.out.println(n1+n2);
			break;
		case "-" :
			System.out.println(n1-n2);
		break;
		case ("*"):
			System.out.println(n1*n2);
		break;
		case "/":
		System.out.println(n1/n2);
		break;
		default:
			System.out.println("Invalid operator");
		
		}
		
		
	
		
		
	}


	}


