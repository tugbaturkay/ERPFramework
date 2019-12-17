package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {
	
    static Scanner input=new Scanner(System.in);
    
    public static ArrayList<String> removeDuplicates(ArrayList<String> words){
    	ArrayList<String> newList=new ArrayList<>();
    	for (String w:words) {
    		if (newList.contains(w)) {
    			continue;
    		}
    		newList.add(w);
    	}return newList;
    }
    
    public static ArrayList<String> filterList(ArrayList<String> words, int length) {
    	ArrayList<String> result=new ArrayList<>();
    	for (String word:words) {
    		if(word.length()==length) {
    			result.add(word);
    		}
    	}
    	return result;
    }
    
	public static ArrayList<String> getStringList(){
		ArrayList<String> words=new ArrayList<>();
		String response,s ;
		do {
			System.out.println("Please enter string: ");
			s=input.nextLine();
			words.add(s);
			System.out.println("Do you wanna add more? \n Y/N ");
			response=input.nextLine();
		}while(response.equalsIgnoreCase("Y"));
		
		return words;
		
	}
	
	public static ArrayList<Integer> getIntegerList(){
		ArrayList<Integer> numbers=new ArrayList<>();
		String response;
		do {
			System.out.println("Please enter number: ");
			int nums=input.nextInt();
			numbers.add(nums);
			System.out.println("Do you wanna add more? \n Y/N ");
			response=input.nextLine();
		}while(response.equalsIgnoreCase("Y"));
		
		
		return numbers;
	}
}


