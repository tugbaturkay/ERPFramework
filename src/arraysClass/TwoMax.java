package arraysClass;

import java.util.Arrays;

public class TwoMax {
	public static void main(String[] args) {
		int[] number= {23,1,34,3,54,54,51};
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		
		System.out.println(number[number.length-1]);
		for(int i=number.length-1;i>=0;i--) {
			if(number[number.length-1]!=number[i]) {
				System.out.println(number[i]);
				break;
			}
			
		}
		

			
	
	}

}
