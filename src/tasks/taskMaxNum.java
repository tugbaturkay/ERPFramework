package tasks;

import java.util.Scanner;

public class taskMaxNum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 integers:");
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		if (n1==n2 && n1==n3) {
			System.out.println("they are all equal");
		}	
		else if (n1>=n2 && n1>=n3) {
			System.out.println("Maximum value of "+n1+","+n2+" and "+n3+" is "+n1);		
			}
		else if (n2>=n1 && n2>=n3) {
			System.out.println("Maximum value of "+n1+","+n2+", and "+n3+"is"+n2);		
			}
		else if (n3>=n2 && n3>=n1) {
			System.out.println("Maximum value of "+n1+","+n2+", and "+n3+"is"+n3);	
		}
	}
}
			
				


