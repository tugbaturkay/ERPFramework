package objectCreation2;

import java.util.Scanner;

public class HouseProp {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	House h1=new House();
	System.out.println("Please enter type of the house:");
	h1.type=input.nextLine();
	System.out.println("please enter the address");
	h1.address=input.nextLine();
	System.out.println("please enter number of rooms");
	h1.numRooms=input.nextInt();
	
  h1.info();
}
}
