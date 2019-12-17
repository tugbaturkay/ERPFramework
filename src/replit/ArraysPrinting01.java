package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting01 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below
		System.out.println(Arrays.toString(arr));
		for(String word:arr) {
			String word1=word.substring(0, 3);
			System.out.println(word1);
		}
			
	
		
	}
}
