package methods;

import java.util.Scanner;

public class StringCon {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String word=input.nextLine();
	String sub=input.nextLine();
	System.out.println(containCon(word));
	System.out.println(removeSub(word,sub));
}
public static String containCon(String word) {
	word=word.toLowerCase().trim();
	if (word.contains(" ") || word.length()<3) {
		System.out.println("Invalid data");
		return "";
	}
	else if(!(word.contains("con"))) {
		return word;
	}else {
		word=word.replace("con", "");
		return word;
	}
	
}
public static String removeSub(String word,String sub) {
	word=word.toLowerCase().trim();
	if (word.contains(" ") || word.length()<3) {
		System.out.println("Invalid data");
		return "";
	}
	else if(!(word.contains(sub))) {
		return word;
	}else {
		word=word.replace(sub, "");
		return word;
	}

}
}
