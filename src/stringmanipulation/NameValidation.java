package stringmanipulation;

public class NameValidation {
	public static void main(String[] args) {
		
		String name="Lawrence";
		boolean check=name.contains("w");
		System.out.println(check);
		
		String str="Apple Inc. is an American multinational technology company";
		boolean b=str.contains("technology");
		System.out.println(b);
	}

}
