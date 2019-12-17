package foreachloop;

public class Groceries {
	public static void main(String[] args) {
		
		String[] groceries= {"Bread","Cucumber","apples","orange","cookies","Cake"};
		int counter=0;
		for(String items:groceries) {
			if(items.charAt(0)>=65 && items.charAt(0)<=90) {
				counter++;
			}
			
		}System.out.println("Total words starting with upper case: " + counter);
	}

}
