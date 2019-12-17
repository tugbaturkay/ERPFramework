package objectCreation2;

public class MyBook {
	public static void main(String[] args) {
		Book book1=new Book("x");
		book1.title="Kite Runner";
		book1.pages=234;
		book1.author="Khalid Sth";
		
		Book book2=new Book("y");
		book2.title="Forty rule of love";
		book2.pages=254;
		book2.author="Elif Shafak";
		
		Book book3=new Book("Z");
		book3.title="Beyoglu rapsodisi";
		book3.pages=351;
		book3.author="Ahmet Umit";
		
	
		Book [] myBook=new Book[3];
		myBook[0]=book1;
		myBook[1]=book2;
		myBook[2]=book3;
		
		for(Book b:myBook) {
			System.out.println(b.author);
		}
		
		
	}

}
