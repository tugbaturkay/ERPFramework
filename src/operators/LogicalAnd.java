package operators;

public class LogicalAnd {
	public static void main(String[] args) {
		int age=18; 
		String name="John";
		String weather="rainy";

		boolean check = ( (age>=21  ) & ((name="Adam")=="James"));
		
		
		System.out.println(check);
		System.out.println(name);
		
	}

}
