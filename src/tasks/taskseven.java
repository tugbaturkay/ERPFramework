package tasks;

import java.util.Scanner;

public class taskseven {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String str;
		boolean multipleWords;
		System.out.println("Please enter the string");
		str=input.nextLine();
		str=str.trim();
		//boolean check=str.contains(" ");
		if(str.contains(" ")) {
			multipleWords=true;
		}
		else {
			multipleWords=false;
		}
		System.out.println("Multiple word: " + multipleWords);
	}

}
