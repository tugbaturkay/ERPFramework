package arraysClass;

public class IncrementArrayValues {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<nums.length;i++) {
		  System.out.print(nums[i]+" ");
		}
		System.out.println();
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]%2==0) {
				nums[i]*=2;
			}else if(nums[i]%2!=0) {
				nums[i]*=3;
			}
			System.out.print(nums[i]+" ");
			
		}
		
		
	}

}
