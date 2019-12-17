package casting;

public class messageTask {
	public static void main(String[] args) {
		String mainMessage="Sender:<Mike Smith>.From Number:[202-123-3456].Message:{I love programming and problem solving}";
		
		String sender,phoneNumber,message;
		int a=mainMessage.indexOf("<");
		int b=mainMessage.indexOf(">");
		sender=mainMessage.substring(a+1,b);
		
		int c=mainMessage.indexOf("[");
		int d=mainMessage.indexOf("]");
		phoneNumber=mainMessage.substring(c+1,d);
		
		int e=mainMessage.indexOf("{");
		int f=mainMessage.indexOf("}");
		message=mainMessage.substring(e+1,f);
		
		System.out.println("Sender: " + sender);
	    System.out.println("phoneNumber: " + phoneNumber);
		System.out.println("message: " + message);
	}

}
