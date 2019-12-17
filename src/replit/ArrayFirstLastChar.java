package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFirstLastChar {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	   String result="[";
	    for(int i=0;i<words.length;i++){
	     char a=words[i].charAt(0);
	     char b=words[i].charAt(words[i].length()-1);
	     String a1=a+"";
	     String b1=b+"";
	     if(i==words.length-1) {
	    	 result+=a1+b1+"]"; 
	     }else 
	     result+=a1+b1+", ";
	    }
	    System.out.println(result);
	  }
	}

