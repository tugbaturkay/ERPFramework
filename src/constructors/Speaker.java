package constructors;

public class Speaker {
	String model;
	double weight;
	int year;
	
	public Speaker(String model) {
		this.model=model;
		this.year=2000;
		this.volumeUp();
		
		//or we can call other constructor-- this(model,2000);
	}
	public Speaker(String model, int year) {
		this.model=model;
		this.year=year;
		this.volumeUp();
	}

	public void volumeUp() {
       System.out.println(model + " is increasing Volume");
       
	}
	public void volumeDown() {
	       System.out.println(model + " is decreasing Volume");
	       
		}
}
