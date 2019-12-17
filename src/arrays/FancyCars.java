package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FancyCars {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter number of cars:");
		int NumberOfCars=input.nextInt();
		input.nextLine();
		String [] myGarage= new String [NumberOfCars];
		
		for (int i=0; i<NumberOfCars; i++) {
			
			System.out.println("Please enter car"+ (i+1)+ ":");
			String carName=input.nextLine();
			myGarage[i]=carName;
			
		}
		System.out.println(Arrays.toString(myGarage));
		
		int counter=0;
			for(int k=0;k<myGarage.length;k++) {
				if (myGarage[k].equalsIgnoreCase("BMW") || myGarage[k].equalsIgnoreCase("Mercedes")) {
					System.out.println("You have a German car");
					counter++;
					break;
			}
			}
			if(counter==0) {
				System.out.println("You do not have a German car");
			}
			}
			
		}

	
	

