package arrayDataDriven;

import java.util.Arrays;

public class WordCounter {
public static void main(String[] args) {
	String str = "Write a program that creates a group of given size program and program";
	String [] words = str.split(" ");
	int counter = 0;
	for(String word: words) {
		if(word.equals("program")) {
			counter++;
		}
	}
	System.out.println(counter);
	// Write a program that prints out the words by the length.
	// Shortest length words first then longer length words.
	System.out.println(Arrays.toString(words));
	for(int n = 1; n < 13; n++) {
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() == n) {
				System.out.println(words[i]);
			}
		}
	}
}
}
	

