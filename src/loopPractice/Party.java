package loopPractice;

import java.util.Scanner;

public class Party {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String guestName,answer;
		String result="";
		do {
			System.out.println("Please enter guest name:");
		      guestName=input.nextLine();
		      System.out.println("Do you want to enter new guest name:");
		      answer=input.nextLine();
		      result+=guestName+",";

		}
		while(answer.equals("yes"));
		System.out.println(result);
	}

}
