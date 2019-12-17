package replit;

import java.util.Scanner;

public class UniqueCharacter {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the message:");
		String message=input.nextLine().toLowerCase().replace(" ","");
		String result="";
		for(int i=0; i<=message.length()-1;i++) {
			char c=message.charAt(i);
			String letter=c+"";
			if(result.contains(letter)) {
				continue;
			}
			  result+=c;
			 
			}
		System.out.println(result);
		}
	}


