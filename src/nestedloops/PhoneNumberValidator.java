package nestedloops;

import java.util.Scanner;

public class PhoneNumberValidator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a phone number");
		String phoneNumber=input.nextLine();
		
		if (phoneNumber.length()!=10 && phoneNumber.length()!=12) {
			System.out.println("invalid length-must be either 12 or 10 characters");
		}
			else if (phoneNumber.length()==12 ) {
				if(phoneNumber.charAt(0)!='('&& phoneNumber.charAt(4)!='(') {
					System.out.println("invalid format-there is no closing paranthesis");	
				}
			}
				
	        phoneNumber=phoneNumber.replace("(", "");
	        phoneNumber=phoneNumber.replace(")", "");
	
			if(phoneNumber.length()==10) {
				for(int i=0;i<phoneNumber.length();i++) {
					char c=phoneNumber.charAt(i);
					int ii=c;
					if(c<47 || c>58) {
			    		System.out.print("Invalid character-must be a number between 0-9");
                        break;
			}
	
	    	}
				
					System.out.println("Valid phone Number");
	    		
			}
		}
		
		
	}



