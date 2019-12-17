package constructors;

public class FaceBookUser {

	String userName;
	int age;
	String name;
	String passWord;
	int numOfFriends;
	
	public void userInfo() {
		System.out.println("\nFACEBOOK USER INFORMATION");
		System.out.println("Name: " + this.name);
		System.out.println("Username: " + this.userName);
		System.out.println("Age: " + this.age);
		System.out.println("Number of Friends: " + this.numOfFriends);
	}
	
	public boolean sendFriendRequest(FaceBookUser user) {
		if(user.numOfFriends<5000) {
			System.out.println("Friend request has been sent to " + user.name);
			user.numOfFriends++;
			this.numOfFriends++;
			return true;
			
		}else {
			System.out.println(user.name+ " can not accept friend request");
			return false;
		}
	}
	
	public FaceBookUser(String userName,String passWord) {
		this.userName=userName;
		this.passWord=passWord;
	}
	public FaceBookUser(String name,String userName,String passWord) {
		
		this.name=name;
		this.userName=userName;
		
		if (passWord.contains(userName)) {
			System.out.println("password can not contain username. Please change password");
			this.passWord="";
		}else {
			this.passWord=passWord;
		}
	}
	
}
