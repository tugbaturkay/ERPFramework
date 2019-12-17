package methods;

import java.util.Scanner;

public class Restaurant {
       public static void main(String[] args) {
    	   printName("hello");
       }
          public static void printName(String name) {
        	  Scanner input=new Scanner(System.in);
        	  System.out.println("please enter your name");
        	  String name2=input.nextLine();
        	    String a=name.substring(0,1); 
             String b=name.substring(name.length()-1);
        	  System.out.println(a+b);
          }
}
