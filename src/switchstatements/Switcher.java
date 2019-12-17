package switchstatements;

public class Switcher {
	public static void main(String[] args) {
		String name="John";
		
		switch(name) {
		case "James":
			System.out.println("James is a good name");
			break;
		case "Jamie":
			System.out.println("Jamie is a okey name");
			break;
		case "John": 
			System.out.println("John Wick??");
			break;//exits the switch statement
			default: 
				System.out.println("Everything else");
		
		}
		
		if (name.equals("James")) {
			System.out.println("james is a good name");
		}
		else if (name.equals("Jamie")) {
			System.out.println("Jamie is a okey name");
		}
		else if (name.equals("John")) {
			System.out.println("John Wick??");
		}
		else {
			System.out.println("Everything else");
		}
	}

}
