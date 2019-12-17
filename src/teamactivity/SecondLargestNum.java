package teamactivity;

public class SecondLargestNum {
	public static void main(String[] args) {
		int []nums= {12,4,8,9,15};
		System.out.println(secondLargestNum(nums));
	}
	
	public static int secondLargestNum(int[] arr) {
		
		int largest=arr[0];
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>largest) {
				largest=arr[i];
			}		
		}
		int second=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > second && arr[i] !=largest) {
				 second = arr[i]; 
	    	}
               
        } 
		
		return second;
	}

}
