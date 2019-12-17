import java.util.Arrays;

public class EvenCollector {
	public static void main(String[] args) {
		int [] nums= {1,2,-3,4,-34,55,78,90,33,10};
		
		int counter=0;
		//loop through numbers array and count even numbers
		for(int number:nums){
			if(number%2==0) {
				counter++;
				
			}
		}
		System.out.println(counter);
		int []evens=new int[counter];
		int i=0;
		for (int num: nums) {
            if(num %2 ==0) {
                evens[i] = num;
                i++;
            }
        }
        System.out.println(Arrays.toString(evens));
		
		
	}

}
