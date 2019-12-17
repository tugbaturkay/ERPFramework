package teamactivity;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		
		String firstWord="silent";
		String secondWord="listen";
		
       System.out.println(isAnagram(firstWord, secondWord));
	}
	
	public static boolean isAnagram (String firstWord, String secondWord) {
		
	     char[] word1 = firstWord.toCharArray();
	     char[] word2 = secondWord.toCharArray();
	     
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     
	 	return Arrays.equals(word1, word2);
		
			
		}

		
	     
	}



