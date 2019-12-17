package teamactivity;

import java.util.Arrays;

public class April22 {
	public static void main(String[] args) {
		String str= "I love you";
		String[] s=str.split(" ");
		String reverse="";
		
		for (int i=s.length-1;i>=0;i--) {
			
			reverse+=s[i]+" ";
			
		}
		System.out.println(reverse);
	}
	
	

}
