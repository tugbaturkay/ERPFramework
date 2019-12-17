package replit;

import java.util.Scanner;

public class UniqueCharacters {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String word=input.nextLine();
		
		String result = "";
        for (int i = 0; i < word.length(); i++){
           if (result.indexOf(word.charAt(i)) == - 1){
              result = result + word.charAt(i);
        }
     }

   System.out.println(result + " ");

	
		
	}

}
