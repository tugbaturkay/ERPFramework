package loops;

import java.util.Scanner;

public class PhoneNUmberValidator {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	boolean valid=true;
	String number=input.nextLine();
	if(!(number.length()==12 || number.length()==10)) {
		valid=false;
		System.out.println("Invalid length");
	}
	else if(number.length()==12) {
		if(!(number.charAt(0)=='(' && number.charAt(4)!=')')) {
			valid=false;
				System.out.println("invalid format");
		}
	
	}
	else if(number.length()==12) {
		number=number.replace("(","");
		number=number.replace(")","");
		System.out.println(number);
	}
	if(number.length()==10) {
		for(int i=0;i<number.length();i++) {
			char c=number.charAt(i);
			int ii=c;
			if(ii<48 || ii>57) {
				valid=false;
				System.out.println("invalid");
				break;
	}
	
		}
	}
	if(valid) {
		System.out.println("Valid number");
	}
}
}
