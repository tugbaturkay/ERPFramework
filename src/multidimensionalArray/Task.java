package multidimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class Task {
	public static void main(String[] args) {
		int [][]nums= {{4,2,6,45,23,1},{22,34,66},{1,2,3}};
		maxValue(nums);
		maxSum(nums);
		int [][] n=getTwoArray(3,5);
		System.out.println(Arrays.deepToString(n));
	}
	public static int [][] getTwoArray(int size,int innerSize) {
		Random r=new Random();
		int [][]numbers=new int[size][innerSize];
		for(int i=0;i<numbers.length;i++) {
			for (int j=0;j<numbers[i].length;j++) {
				numbers[i][j]=r.nextInt(100);
			}
		}
		return numbers;
	}
	
	public static void maxValue(int [][] nums) {
		int max=nums[0][0];
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(nums[i][j]>max) {
					max=nums[i][j];
				}
			}
		}System.out.println(max);
	}
	public static void maxSum(int [][] nums) {
		int sum;
		int maxSum=Integer.MIN_VALUE;
		int index=0;		
		for(int i=0;i<nums.length;i++) {
			sum=0;
			for(int j=0;j<nums[i].length;j++) {
				sum+=nums[i][j];
			}
			if(sum>maxSum) {
			maxSum=sum;
				index=i;
			}
		}System.out.println(Arrays.toString(nums[index]));
	}

}
