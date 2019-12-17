package objectCreation;

public class Driver {
	public static void main(String[] args) {
		Car c1=new Car();
		
		c1.make="Lexus";
		c1.mileage=50000;
		c1.year=2018;
		System.out.println(c1.year);
		System.out.println(c1.mileage);
		c1.drive();
		System.out.println(c1.mileage);
		c1.drive(1000);
		System.out.println(c1.mileage);
	}
	

}
