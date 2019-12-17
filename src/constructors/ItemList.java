package constructors;

import java.util.Arrays;
import java.util.Scanner;

public class ItemList {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter number of items");
	int NumOfItems=input.nextInt();
	input.nextLine();
	Item [] myItems=new Item [NumOfItems];
	for(int i=0;i<NumOfItems;i++) {
		System.out.println("Please enter name for item " +(i+1));
		String name=input.nextLine();
		System.out.println("Please enter price for item " +(i+1));
		double price=input.nextDouble();
		input.nextLine();
		
		Item item=new Item(name,price);
		myItems[i]=item;
	}   
	for(Item i:myItems) {
		i.info();
	}
	
	
}


}
