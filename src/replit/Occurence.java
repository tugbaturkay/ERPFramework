package replit;

import java.util.Scanner;

public class Occurence {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter word:");
	    String str = input.next().toLowerCase();
	   
	    char[] letter=new char[str.length()];
	
	    int counter = 0;
	    for (int i = 0; i < str.length(); i++) {
	    	letter[i] = str.charAt(i);
	    System.out.println(letter[i]);
	    	for(int j = 1; j <= i; j++) {  
	    		if(letter[j] == str.charAt(i)) {
		    		counter++;

	} 
	    		
}if(counter>0) {
	System.out.print(str.charAt(i)+":"+counter);
}
}
	}
}
