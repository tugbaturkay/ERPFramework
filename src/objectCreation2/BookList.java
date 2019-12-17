package objectCreation2;

import java.util.Scanner;

public class BookList {
	public static void main(String[] args) {
		Book b1=new Book("red");
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter total books");
		int numBooks=input.nextInt();
		input.nextLine();
		Book [] books=new Book[numBooks];
		for(int i=0;i<numBooks;i++) {
			System.out.println("Please enter title for book "+ (i+1));
			b1.title=input.nextLine();
			System.out.println("Please enter author for book "+ (i+1));
			b1.author=input.nextLine();
			System.out.println("Please enter pages for book "+ (i+1));
			b1.pages=input.nextInt();
			input.nextLine();
			books[i]=b1;
		}
		
		
		
	}

}
