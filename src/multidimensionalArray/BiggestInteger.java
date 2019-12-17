package multidimensionalArray;

import java.util.Arrays;

public class BiggestInteger {
	
	
	public static void main(String[] args) {
		int [][] nums = { {4,2,6,45,23}, {22,34,66}, {1,2,3}};
		maxValue(nums);
	}
	public static void maxValue(int [][] nums) {
		//smallest value that integer can hold
		//Integer.minValue
		int max=nums[0][0];
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(nums[i][j]>max) {
					max=nums[i][j];
				}
			}
			
	}
		System.out.println("Max:" + max);
		
	}

}
