package replit;

import java.util.Scanner;

public class U7 {
	public static void main(String[] args){
		int members;
		double GPA;
		String TeamName;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of your team?:");
		TeamName=input.nextLine();
		System.out.println(TeamName);
		
		System.out.println("What was your GPA?");
		GPA=input.nextDouble();
		System.out.println(GPA);
		
		System.out.println("how many members in your team?:");
		members=input.nextInt();
		System.out.println(members);
		
		
		int area,perimeter;
		int width;
		int length;
		
	
		
		System.out.println("Select a width:");
		width=input.nextInt();
		System.out.println(width);
		System.out.println("Select a length:");
		length=input.nextInt();
		System.out.println(length);
		System.out.println("Area of rectangle: " + width*length);
		System.out.println("Perimeter of rectangle: " + 2*(width+length));
		
	
		
		
		
		
		
	}

}
