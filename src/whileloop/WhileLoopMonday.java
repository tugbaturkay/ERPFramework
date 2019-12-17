package whileloop;

import java.util.Scanner;

public class WhileLoopMonday {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		String result;
		String number=input.next();
		
		if (number.length()>3) {
			result="$"+number.substring(0,number.length()-3)+","+number.substring(number.length()-3);
			System.out.println(result);
			
		}
		else {
			System.out.println("Must be greater that 3 digits.");
		}
	}
}
