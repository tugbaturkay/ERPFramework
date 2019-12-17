package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyGarage {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter number of cars");
		
		int numberOfCars=input.nextInt();
		String [] cars=new String[numberOfCars];
		input.nextLine();
	   
		for(int i=0;i<numberOfCars;i++) {
			//cars[i]="Aston martin";
			System.out.println("Please enter car name:" + i);
			String carName=input.nextLine();
			cars[i]=carName;
			
		}System.out.println(Arrays.toString(cars));
		  //cars[0]="BMW";
		  //cars[cars.length-1]="Mercedes";
		boolean check=true;
		  for ( int k=0;k<numberOfCars;k++) {
			  if(cars[k].contains("BMW")||cars[k].contains("Mercedes")) {
					System.out.println("You have German car");
					check=true;
					break;
				}if(check!=true) {
					System.out.println("You dont have German car");
				}
					
					
				
		  }
		  
	}

}
