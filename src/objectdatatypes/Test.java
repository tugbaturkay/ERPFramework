package objectdatatypes;

public class Test {
	public static void main(String[] args) {
		Watch watch1=new Watch();
		
		watch1.brand="Fossil";
		watch1.color="black";
		System.out.println(watch1.brand);
		System.out.println(watch1.color);
		
		Watch watch2=new Watch();
		watch2.price=99.99;
		watch2.style="sport";
		System.out.println(watch2.price);
		System.out.println(watch2.style);
		
		watch1.tick();
	}

}
