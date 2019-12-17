package constructors;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in) ;
			System.out.println("Please enter model of the phone");
			String model=input.nextLine();
			System.out.println("Please enter the color of the phone");
			String color=input.nextLine();
			
			Phone ph1=new Phone(model,color);
			System.out.println("Please enter a phone number to call");
			long phoneNumber=input.nextLong();
			ph1.call(phoneNumber);
		
		}
	}


