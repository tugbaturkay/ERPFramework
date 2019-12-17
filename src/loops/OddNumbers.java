package loops;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	//	for(int i=1; i<50; i+=2) {
		
		for (int i=0; i<=50; i++) {
			if(i%2==1) {
			System.out.println(i);
			
			}
			else {
				System.out.println("Even number here");
			}
		}
	}

}
