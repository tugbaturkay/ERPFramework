package arrays;

import java.util.Arrays;

public class Person {
	public static void main(String[] args) {
		int []ages=new int[5];
		ages[0]=12;
		ages[1]=22;
		ages[2]=32;
		ages[3]=42;
		ages[4]=52;
		System.out.println(Arrays.toString(ages));
		
		String[]names=new String[4];
		names[0]="can";
		names[1]="ali";
		names[2]="nur";
		names[3]="su";
		System.out.println(names[1]);
		System.out.println(names[2]);
		
	   double[]prices= {45.99,23.5,11.50,33.33,99.99};
	   prices[4]=112.89;
	   System.out.println(Arrays.toString(prices));
	   
	   }
	}


