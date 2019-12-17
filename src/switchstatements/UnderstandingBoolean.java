package switchstatements;

import java.util.Scanner;

public class UnderstandingBoolean {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name,response="null";
		boolean currentStudent;
		System.out.println("Please enter your name:");
		name=input.nextLine();
		System.out.println("Are you currently a student?\nyes/no");
		response=input.nextLine();
		if(response.equals("yes")) {
			currentStudent=true;
			
		}else {
			currentStudent=false;
		}System.out.println("Name:"+name);
		System.out.println("Current student:"+ currentStudent);
		if(currentStudent) {
			System.out.println(name +" You rock");
		}
			
	} 

}
