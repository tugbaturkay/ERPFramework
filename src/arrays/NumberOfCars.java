package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfCars {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter number of cars:");
		int NumberOfCars=input.nextInt();
		String [] myGarage= new String [NumberOfCars];
		
		myGarage[0]="BMW";
		myGarage[myGarage.length-1]="Mercedes";
		for(int i=1;i<myGarage.length-1;i++) {
			myGarage[i]="Aston Martin";
			
		}System.out.println(Arrays.toString(myGarage));
		
	}

}
