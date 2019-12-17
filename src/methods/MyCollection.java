package methods;

import java.util.Arrays;

public class MyCollection {
	public static void main(String[] args) {
		int [] nums= {23,53,2,-4,23,-45,-785,1};
		printNegativeNums(nums);
		int []numbers= {2,3,-4,6};
		Arrayreplace(numbers,5);
	}
   public static void printNegativeNums(int [] numbers) {
	   for (int num:numbers) {
		   if(num<0) {
			   System.out.println(num);
		   }
	   }
   }
   
   
private static void Arrayreplace(int[] nums, int replacement) {
	for (int i=0;i<nums.length;i++) {
		   if(nums[i]<0) {
			  nums[i]=replacement;
		   }
		   
	   }System.out.println(Arrays.toString(nums));
	// TODO Auto-generated method stub
	
}
}
