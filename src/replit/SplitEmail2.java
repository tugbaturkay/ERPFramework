package replit;

import java.util.Scanner;

public class SplitEmail2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	
		int counter=0;
	    if (!(email.contains("@"))){
			      System.out.println("invalid email");
			    }
		     else  {
		       for(int i=0;i<email.length()-1;i++){
		         char c=email.charAt(i);
		         if(c=='@'){
			         	counter++;
			       }
		       } 
		    
		    	System.out.println(counter);
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
}
