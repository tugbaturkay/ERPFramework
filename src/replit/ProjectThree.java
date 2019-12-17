package replit;
import java.util.*;
public class ProjectThree {
	

	
	  public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);  
	    
	    // TASK 1
	    System.out.println("Enter number in word(ex: one, two..):");
	    String str1 = input.nextLine();
	    
	    //your code here 
	    //----------------------------------------------------------
	     
	     String str5=str1.toLowerCase();
	     
	       
	       switch(str5){
	         case "zero":
	       System.out.println("0");
	       break;
	         case "one":
	           System.out.println("1");
	       break;
	         case "two":
	           System.out.println("2");
	       break;
	       case "three":
	           System.out.println("3");
	       break;
	       case "four":
	           System.out.println("4");
	       break;
	       case "five":
	           System.out.println("5");
	       break;
	       case "six":
	           System.out.println("6");
	       break;
	       case "seven":
	           System.out.println("7");
	       break;
	       case "eight":
	           System.out.println("8");
	       break;
	       case "nine":
	           System.out.println("9");
	       break;
	       case "ten":
	           System.out.println("10");
	       break;
	       default:
	       System.out.println("Out of bond");
	       
	           
	       }
	     
	     
	     




	    
	  
	    //----------------------------------------------------------
	    
	    //TASK 2
	    System.out.println("Enter word:");
	    String str2 = input.nextLine().toLowerCase();
	    
	    //your code here 
	    //---------------------------------------------------------- 
	      
	      int position, len;
	        
	            
	    if (str2.length()>=3 && str2.length()<=100){
	      
	      if (str2.length()%2!=0){
	        position=str2.length()/2;
	        String c=str2.substring(position,position+1).toUpperCase();
	       System.out.println(str2.substring(0, position)+c+str2.substring(position+1));
	        }
	        else {
	          position=str2.length()/2-1;
	          
	          String c2=str2.substring(position,position+2).toUpperCase();
	       System.out.println(str2.substring(0, position)+c2+str2.substring(position+2));
	        }
	      
	      }
	      

	    else {
	      System.out.println("Invalid enter");
	    }
	    
	    
	    
	    
	    
	    //----------------------------------------------------------
	    
	    //TASK 3
	    
	    System.out.println("Enter two words(separate with space):");
	    String str3 = input.nextLine();
	    
	    //your code here 
	    //----------------------------------------------------------
	    
	    

	  }
	}


