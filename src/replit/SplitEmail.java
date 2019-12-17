package replit;

import java.util.Scanner;

public class SplitEmail {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    if (!(email.contains("@"))){
		      System.out.println("invalid email");
		    }
	    int counter=0;
	     if(email.contains("@")) {
	    	counter++;
	    }
	    if(counter!=1) {
	    	System.out.println("invalid email");
	    }
	    else{
	    String info[]=email.split("@");
	    //System.out.println(Arrays.toString(info));
	    String id="";
	    String domain="";
	    for(int i=0;i<info.length;i++){
	      id=info[0];
	      domain=info[info.length-1];
	      
	    }
	    System.out.println("Email id: "+ id);
	      System.out.println("Email domain: "+ domain);
	    }
	  }

}
