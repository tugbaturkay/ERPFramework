package replit;

import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		System.out.println("Please enter word:");
	    Scanner scanner = new Scanner(System.in);
	    String n1 = scanner.nextLine();
	    boolean check=true;
	    int counter=0;
	    if(n1.length()<8) {
	    	System.out.println("Password should contain minimum 8 characters");
	    }else {
	    	for (int i=0;i<n1.length();i++) {
	    		if(n1.charAt(i)<65 && n1.charAt(i)>90) {
	    			System.out.println("Password should contain at least 1 uppercase number");
	    			break;
	    		} 
	    		else if(n1.charAt(i)<97 && n1.charAt(i)>122) {
		    			System.out.println("Password should contain at least 1 lowercase number");
		    		break;
	    		}
	    		else if(n1.charAt(i)<48 && n1.charAt(i)>57) {
		    			System.out.println("Password should contain at least one digit");
		 
		    			break;
    		}
	    		else if((n1.charAt(i)<33 && n1.charAt(i)>47)||(n1.charAt(i)<58 && n1.charAt(i)>64)) {
			    			System.out.println("Password should contain at least one special character");
			    			break;
			    		}
	    	    }
	    	    	
	    		}
	    	    
	    		}
	    	}
	    	
	  
	    
	    			
	    		
	    		
	    		
	    		 
			  		
			    		
	    			 
	   
	
	

