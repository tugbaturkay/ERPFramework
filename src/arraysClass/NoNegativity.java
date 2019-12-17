package arraysClass;

import java.util.Arrays;

public class NoNegativity {
	public static void main(String[] args) {
		int[]nums= {1,2,-3,4,-34,55,78,90,33,10};
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				nums[i]=0;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
