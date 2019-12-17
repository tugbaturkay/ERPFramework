package constructors;

public class Bank {
	
	public static void main(String[] args) {
		
		DebitCard dc=new DebitCard(3457435623128990l,"James Bond","Visa" ,4456, 100.0) ;
			
		System.out.println(dc.type);
	}

}
