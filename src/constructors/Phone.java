package constructors;

public class Phone {
	boolean touchScreen;
	String model;
	int memory;
	String color;
	long phoneNumber;
	
	public Phone(String model, String color) {
		this.model=model;
		this.color=color;
	}
	public Phone(String model, String color,int memory,boolean touchScreen) {
		this.model=model;
		this.color=color;
		//or we can call previous constructor-- this(model,color);
		this.touchScreen=touchScreen;
		if(memory>0) {
			this.memory=memory;
		}else {
			System.out.println("Invalid memory");
		}
	}
	
	public boolean text(long phoneNumber,String message) {
		String phNum=phoneNumber+"";
		if(phNum.length()==10 && !message.isEmpty()) {
			System.out.println(message +" sent to "+ phNum);
			return true;
		}else {
			System.out.println("Invalid phone number or text body");
			return false;
		}
		
	}
	
	public void call(long phoneNumber) {
		String phNum=phoneNumber+"";
		if(phNum.length()==10) {
			System.out.println("Calling to "+ phNum);
		}else {
			System.out.println("Invalid phone number");
			
		}
	}

}
