package tasks;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two double numbers");
		double number1,number2,result = 0 ;
		number1=input.nextDouble();
		number2=input.nextDouble();
		boolean InvalidOperator=false;
		System.out.println("Please choose one of the operators below:\n*,+,-,/");
		String operator=input.next();
		switch(operator) {
		case "+":
			result=number1+number2;
			break;
		case "-":
			result=number1-number2;
			break;
		case "*":
			result=number1*number2;
			break;	
		case "/":
			result=number1/number2;
			break;	
		default:
			System.out.println("Invalid operator,Please try again");
		InvalidOperator=true;
		
		}if (!InvalidOperator) {
			System.out.println("Result of "+number1+operator+number2+" is "+ result);
		}
		
		
		}
		
	}


