package multidimensionalArray;

public class N {
	public static void main(String[] args) {
		String word="tubayu";
		checkLength(word,4);
	}
	
	public static void checkLength(String word,int number) {
	
		int length=word.length();
		if (length==number) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}
}

