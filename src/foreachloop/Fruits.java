package foreachloop;

public class Fruits {
	public static void main(String[] args) {
		String[] favoriteFruits= {"Orange","Apples","Pineapple","Mango"};
		
		for(String fruits:favoriteFruits) {
			if(fruits.length()%2==0) {
				System.out.println(fruits);
			}
		}
	}

}
