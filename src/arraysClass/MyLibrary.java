package arraysClass;

import java.util.Arrays;
import java.util.Scanner;

public class MyLibrary {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] myBook= {"Sefiller","Pi","Chi","Unbeatable minds","Fi"};
		
		System.out.println("Please enter the book to replace");
		String bookReplaced=input.nextLine();
		
		System.out.println("Please enter the new book");
		String newBook=input.nextLine();
		
		Arrays.sort(myBook);
		int index=Arrays.binarySearch(myBook,bookReplaced);
		System.out.println(index);
		if(index>=0) {
			myBook[index]=newBook;
		}
			System.out.println(Arrays.toString(myBook));
		}
		
	
		
		
				
	}


