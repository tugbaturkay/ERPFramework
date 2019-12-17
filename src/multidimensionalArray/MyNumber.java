package multidimensionalArray;

public class MyNumber {
	public static void main(String[] args) {
		
		int [][] nums= {{23,24,34,45,55},{1,2,3,4,5},{4,7,8,9,10},{34,56,7,8,2},{43,23,13,53,63}};
		int sum;
		int max=0;
		for (int []n:nums) {
			sum=0;
			for(int i:n) {
				
				System.out.print(i+" ");
				sum+=i;
			}
			System.out.println(sum);
			System.out.println();
			if(sum>max) {
				max=sum;
			}
		}
		System.out.println(max);
		
		
	}

}
