package inputs;

import java.util.Scanner;

public class TimeCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Time Calculator");
		System.out.println("Please enter seconds");
		int seconds=input.nextInt();
		int minutes=seconds/60;
		int remainingSeconds=seconds%60;
		int hours=minutes/60;
		int remainingMinutes=minutes%60;
		System.out.println(seconds + "seconds converted into:");
		System.out.println(hours +"hours");
		System.out.println(remainingMinutes+ "minutes");
		System.out.println(remainingSeconds + "seconds");
		
	}

}
