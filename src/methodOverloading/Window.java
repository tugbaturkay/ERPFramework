package methodOverloading;

public class Window {
	public static void main(String[] args) {
		//printArray(23,3,23,4,56,7,8);
		findMax(23,3,23,4,56,7,8);
	}
	
	
public static void printArray(int ...nums) {
	for (int i:nums) {
		System.out.println(i);
	}
}
public static void findMax(int ...nums) {
	int max=nums[0];
	for(int num:nums) {
		if(num>max) {
			max=num;
		}
	}
	System.out.println(max);
}
}
