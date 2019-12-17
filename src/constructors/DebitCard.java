package constructors;

public class DebitCard {
	long cardNumber;
	String holderName;
	String type;
	int pin;
	double balance;
	
	public DebitCard(long cardNumber,String holderName,String type,	int pin,double balance) {
		this.holderName=holderName;
		this.balance=balance;
		if (type.equalsIgnoreCase("Mastercard") || type.equalsIgnoreCase("Visa")) {
			this.type=type;
		}else {
			System.out.println("Invalid type");
		}
		String pin2=pin+"";
		if (pin2.length()==4) {
			this.pin=pin;
		}else {
			System.out.println("Invalid pin");
		}
		String cardNum=cardNumber+"";
		if (cardNum.length()==16) {
			this.cardNumber=cardNumber;
		}else {
			System.out.println("Invalid car number");
		}
	}

}
