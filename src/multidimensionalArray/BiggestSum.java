package multidimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class BiggestSum {
	public static void main(String[] args) {
		//int[][] n = { { 4, 2, 6, 45, 23, 1 }, { 22, 34, 66 }, { 1, 2, 3 } };
		//highestSum(n);
		randomArray(3,2);
		int[][] n2=getMultiArray(2,3);
		System.out.println(Arrays.deepToString(n2));
	}

	public static void highestSum(int[][] nums) {
		
		int maxSum = Integer.MIN_VALUE;
		int index=0;
		for (int i = 0; i < nums.length; i++) {
			     int sum = 0;
			for (int j = 0; j < nums[i].length; j++) {
				
				sum += nums[i][j];
			}
				if (sum > maxSum) {
					maxSum=sum;
					index=i;
					
			}

		}
		System.out.println(Arrays.toString(nums[index]));
	}
     public static void randomArray(int numsa, int numsb) {
    	 Random r=new Random();
    	 int [] set1=new int[numsa];
    	 int [] set2=new int[numsb];
    	 
    	 for (int i = 0; i < numsa; i++) {
    		 
    				set1[i]=r.nextInt(100);
    	 }
    	 
    	 for (int j = 0; j < numsb; j++) {
    		
    				set2[j]=r.nextInt(100);	    	 
    	 } 
    	 System.out.println(Arrays.toString(set1));
    	 System.out.println(Arrays.toString(set2));
     }
     
     public static int[][]getMultiArray(int size1,int size2){
    	 int[][]numbers=new int[size1][size2];
    	 Random r=new Random();
    	 for (int i = 0; i < numbers.length; i++) {
    		 for (int j = 0; j < numbers.length; j++) {
    			 numbers[i][j]=r.nextInt(100);
    		 }
    	 }
		
    	 
    	 return numbers;
     }
}
