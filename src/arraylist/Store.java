package arraylist;

import java.util.ArrayList;

import constructors.Item;

public class Store {
	
	String name;
	String address;
	ArrayList<Item> storeItems=new ArrayList<>();
	int numOfItems;
	double totalSales;
	
	public void refund(Item item) {
		addItem(item);
		totalSales-=item.price;
	}
	public boolean checkItem(String itemName) {
		for(Item item:storeItems) {
			if(item.name.equals(itemName)) {
				System.out.println(itemName + "is found in stock");
				return true;
			}
		}
		System.out.println(itemName + "not found in stock");
		return false;
		
	}
	
	public void sell(String itemName) {
		/*for(Item item:storeItems) {
			if(item.name.equals(itemName)) {
				System.out.println(itemName + " is sold for " +  item.price);
				numOfItems--;
				totalSales+=item.price;
				storeItems.remove(item);
				break;
			}
		}*/
		
		
		for(int i=0;i<storeItems.size();i++) {
			if(storeItems.get(i).name.equals(itemName)) {
				System.out.println(itemName + " is sold for " +  storeItems.get(i).price);
				numOfItems--;
				totalSales+=storeItems.get(i).price;
				storeItems.remove(i);
				break;
			}
		}
	}
	
	public Store(String name,String address) {
		this.name=name;
		this.address=address;
	}
	
	public void addItem(Item item) {
		storeItems.add(item);
		numOfItems++;
		
	}
	public void seeInventory() {
		for(Item a:storeItems) {
			a.info();
		}
		
	}

}
