package arrays;

import java.util.Arrays;

public class NoNegativity {
	public static void main(String[] args) {
		int[] numbers= {1,2,-3,4,-34,55,78,90,33,10};
		
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<0) {
				numbers[i]=0;
			}
				
		}
	
        System.out.println(Arrays.toString(numbers));
	
	}
}
