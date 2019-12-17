package wednesdays;


import java.util.Arrays;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		countWord();
	}
	
	public static void countWord(){
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String s=input.nextLine();
		String [] sarr=s.trim().split(" ");
		System.out.println(Arrays.toString(sarr));
		System.out.println(sarr.length);
	}

}
