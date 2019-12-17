package foreachloop;

public class Emails {
	public static void main(String[] args) {
		
		String[] emails= {"tuba@na.edu", "su@na.edu", "yug@com","elif@gmail.com","su@gmailcom"};
		
		for(String email:emails) {
			if(email.contains("@")&& email.contains(".")) {
				System.out.println(email);
			}
		}
	}

}
