package arrays;

import java.util.Arrays;
import java.util.Random;

public class DataBase {
	public static void main(String[] args) {
		int []age=new int[50];
		
		Random r=new Random();
		
		//age [2] =randomAge;
		
		for(int i=0; i<age.length;i++) {
			int randomAge=r.nextInt(100);
			age[i]=randomAge;
			
		}System.out.println(Arrays.toString(age));
	}

}
