package stringmanipulation;



public class Account {
	public static void main(String[] args) {
		
		/*String accountNumber1="Your account number is: 257389ACCD";
		String accountNumber2="Your account number is: 523117XYZ";
		
	if (accountNumber1.charAt(24)=='2') {
		System.out.println(accountNumber1.substring(24,30));
		}
	*/
		String s1 ="Your account number: 257389ACCD ";
		//String s2 ="Your account number: 523117XYZ ";
		
		/*if (s1.charAt(21)=='2') {
			System.out.println("cool");
		}
		else if (s1.charAt(21)=='5') {
			System.out.println("not cool");
		}
		*/
		int i=s1.indexOf(":")+2;
		//even if the position of 2 changes, it will still find it.
		System.out.println(i);
		if (s1.charAt(i)=='2') {
			System.out.println("Cool");
		}
		else {
			System.out.println("Not cool");
		}
		
	}

}
