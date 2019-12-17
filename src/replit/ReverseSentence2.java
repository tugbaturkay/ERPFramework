package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence2 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    String reversed = "";
		    //TODO: start your code here
		    String words[]=sentence.split(" ");
		    System.out.println(Arrays.toString(words));
		    for(int i=words.length-1;i>=0;i--) {
		    	String a=words[i];
		    	if(i==0){
			    	  reversed+=a;
			    	}
			    	
			    	  else{
			    	  reversed+=a+" ";
			    	}
		    }
		    
		    //End your code here. do not modify below statement
		    
		    
		  }
	}


