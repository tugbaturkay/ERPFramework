package tasks;

import java.util.Scanner;

public class tasksix {
	public static void main(String[] args) {
		
System.out.println("Please enter the time to check campus hours:");
	
	
	Scanner input=new Scanner(System.in);
	int time=input.nextInt();
	boolean campusOpen=input.hasNextBoolean();

   if (time>8 && time<24) {
	   System.out.println("Campusopen:" + campusOpen);
	   
   }
   else {
	   System.out.println("Campusopen:" + campusOpen);
   }

}

}

