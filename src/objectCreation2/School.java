package objectCreation2;

public class School {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="ibrahim";
		s1.age=12;
		s1.email="ibr@gmail.com";
		
		s1.read();
		
		Book b=new Book("SEDT");
		b.title="SDET";
		b.author="Someone";
		b.pages=230;
		
		s1.read(b);
	}

}
