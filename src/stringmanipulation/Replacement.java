package stringmanipulation;

public class Replacement {
	public static void main(String[] args) {
		String message="Hello";
		String message2=message.replace(message, "hi");
		System.out.println(message2);
		String msg="helllo";
		String s=msg.replace("ll", "TTT");
		System.out.println(s);
	}

}
