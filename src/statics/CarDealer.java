package statics;

import java.util.ArrayList;

import utilities.MyCollection;

public class CarDealer {
	public static void main(String[] args) {
		
		System.out.println(Lexus.totalLexus);
		Lexus l1=new Lexus("ES 350",2018);
		System.out.println(Lexus.totalLexus);
		System.out.println(Lexus.mileToKm(45));
		
		//ArrayList<String> myList=MyCollection.getStringList();
		//System.out.println(myList);
		ArrayList<Integer>myListNum=MyCollection.getIntegerList();	
		System.out.println(myListNum);
	}

}
