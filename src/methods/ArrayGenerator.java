package methods;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(numbers(6,100)));
		int [] arr= {1,2,3,4,5,6,8};
		System.out.println(countEven(arr));
		System.out.println(countEven(numbers(5,50)));
	}
	public static int [] numbers (int size,int bound) {
		Random r=new Random();
		int []numbers=new int[size];
		for (int i=0;i<size;i++) {
			int nums=r.nextInt(bound);
			numbers[i]=nums;
		}
		return numbers;
	}
	
	public static int countEven(int [] arr) {
		
		int counter=0;
		for(int i:arr) {
			if(i%2==0) {
				counter++;
			}
		}
		return counter;
		}
		

}
