package replit;

public class ArrayCheckNumbers {
	public static void main(String[] args) {
		int[] nums={5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
		
		int counter=0;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					counter++;
				}
				
				
			}
			if (counter==1) {
				System.out.print(nums[i]+" ");
				
			}
			counter=0;
			
		}
		
	}

}
