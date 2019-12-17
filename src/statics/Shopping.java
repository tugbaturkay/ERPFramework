package statics;

public class Shopping {
	public static void main(String[] args) {
		BestBuy b1=new BestBuy();
		b1.location="Chicago Downtown";
		BestBuy b2=new BestBuy();
		b2.location="Des Plaines IL";
		BestBuy b3=new BestBuy();
		b3.location="Ohare";
		BestBuy.numOfComputers=90;
		System.out.println(b1.numOfComputers);
	}

}
