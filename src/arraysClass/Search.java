package arraysClass;

import java.util.Arrays;

public class Search {
	public static void main(String[] args) {
		int num[]= {45,23,6,-3,66};
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==-3) {
				System.out.println(i);
				break;
			}
			
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		int result=Arrays.binarySearch(num,23);
		System.out.println(result);
	}
	
	
 
}
