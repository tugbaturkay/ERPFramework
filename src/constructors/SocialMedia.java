package constructors;

public class SocialMedia {
	
	public static void main(String[] args) {
		FaceBookUser fb1=new FaceBookUser("ibbfhd","lk123");
		FaceBookUser fb2=new FaceBookUser("ece","123abc");
		
		
		fb1.name="James";
		fb1.age=23;
		fb1.numOfFriends=25;
		fb2.name="ece";
		fb2.age=18;
		fb2.numOfFriends=43;
		
		System.out.println(fb2.age);
		FaceBookUser fb3=new FaceBookUser("ece","jwick","jwick23");
		System.out.println(fb3.passWord);
		
		boolean check=fb1.sendFriendRequest(fb2);
		System.out.println(check);
		System.out.println(fb1.numOfFriends);
		
		fb1.userInfo();
		
	}

}
