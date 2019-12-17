package stringmanipulation;

public class CheckAccount {
	public static void main(String[] args) {
		String s="Account Number: 255572ACCD";
		//Check if "number" is starting with upper case or lower case
		//print "Starts with upper case" if "Number"
		//print "Starts with lower case" if "number"
		int nIndex=s.indexOf(":")-6;
		
		if (s.charAt(nIndex)=='N') {
		System.out.println("Starts with upper case");
		
	}
		else {
			System.out.println("Starts with lower case");
		}
	
}
}
