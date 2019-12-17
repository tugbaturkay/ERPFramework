package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    
		    int decimal = input.nextInt();
		    int[] binary = new int[8];
		    int i=0;
		    while (decimal > 0){ 
	     
	            binary[i] = decimal % 2; 
	            decimal = decimal / 2; 
	            i++; 
	        } 
		    for (int j = i-1; j >= 0; j--) {
		    	System.out.println(Arrays.toString(binary));	
	    } 
		    
		    }
	


}