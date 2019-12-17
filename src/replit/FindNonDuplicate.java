package replit;

import java.util.Arrays;
import java.util.Scanner;

public class FindNonDuplicate {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    System.out.println(Arrays.toString(nums));
	  
	    int counter=0;
	  Arrays.sort(nums);
	  System.out.println(Arrays.toString(nums));
	   int i;
	    for (i=0;i<nums.length-1;i++) {
	    	counter=0;
	    		if(nums[i]==nums[i+1]) {
		    counter++;
		    	}
	    		
	    }// if(counter==0) {
			System.out.println(nums[i]);
		//} 
	    	
	    
	    	
	    

	    	


	}
}
