package stringmanipulation;

public class PrintAccountNumber {
	
	public static void main(String[] args) {
		String s="Account Number: 57389ACCD";
		
		int indexOfFirst=s.indexOf(":")+2;
		char firstDigit=s.charAt(indexOfFirst);
		String account;
		if (firstDigit=='2') {
			account=s.substring(indexOfFirst, indexOfFirst+6);
		}
		else {
			account=s.substring(indexOfFirst, indexOfFirst+5);
		}
		System.out.println("Account:" + account);
	}

}
