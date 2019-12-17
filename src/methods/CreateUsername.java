package methods;

import java.util.Random;

public class CreateUsername {
	public static void main(String[] args) {
		
		createUsername("James","Bond");
		reverseString("tuba");
	}
	
	public static void createUsername(String firstName,String lastName) {
		Random r=new Random();
		int number=r.nextInt(100);
	   firstName=firstName.toLowerCase();
	   lastName=lastName.toLowerCase();
	   
	   System.out.println(firstName+lastName+number);
	}
	public static void reverseString(String word) {
		String result="";
		for (int i=word.length()-1;i>=0;i--) {
			char c=word.charAt(i);
			result+=c;
			
		}System.out.println(result);
	}
}
