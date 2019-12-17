package ifelsestatements;

import java.util.Scanner;

public class deneme {
	public static void main(String[]args) {
		
	Scanner input= new Scanner(System.in);
	int numberOfCall;
    double bill=0.0;
    System.out.println("Enter number of calls:");
    numberOfCall = input.nextInt();
    
    // your code here. (DO NOT change existing code)
    //----------------------------------------------
if (numberOfCall<=100){
  bill=200;
}
  else if (numberOfCall>100 && numberOfCall<=150){
    bill=200+0.60*(numberOfCall-100);
}

     else if (numberOfCall>150 && numberOfCall<=200){
       bill=200+0.60*50+(0.50*(numberOfCall-150)) ;
       
     }
     
     else {
       bill=200+0.60*50+0.50*50+(0.40*(numberOfCall-200));
       
       System.out.println("Your bill is $"+bill);
     }
    
    //----------------------------------------------
       System.out.println("Your bill is $"+bill);
    
  }
}

