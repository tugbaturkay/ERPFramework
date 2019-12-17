package replit;

import java.util.Scanner;

public class TaskMonday {
	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
   
   
    int counterP=0;
    int counterN=0;
    int counterZ=0;
    String s;
    do {
    	System.out.print("Enter the number");
    	  int number=input.nextInt();
    	System.out.println(number);
    	if(number>0) {
    		counterP++;
    	} else if(number<0) {
    		counterN++;
    	}else {
    		counterZ++;
    	}
    	System.out.println("Do you want to continue y/n?");
    	s=input.next();
    	
    }
      while(s.equals("y"));
	System.out.println("Positive Numbers:" + counterP);
	System.out.println("Negative Numbers:" + counterN);
	System.out.println("Zero Numbers:" + counterZ);
    }

	
 
}
