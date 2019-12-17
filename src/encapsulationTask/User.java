package encapsulationTask;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	ArrayList<User> friends;
	ArrayList<Post> posts;
	private String name;
	private int age;
	private String location;
	static ArrayList<User> allUsers=new ArrayList<>();
	
	public User(String name,int age) {
		this.name=name;
		this.setAge(age);
		this.friends=new ArrayList<>();
		this.posts=new ArrayList<>();
		allUsers.add(this);
	}

	public void createPost(String postBody){
		System.out.println(postBody + " is posted successfully");
		Post p=new Post(postBody);
		this.posts.add(p);
	}

	public void info() {
		System.out.println("\nUser Information");
		System.out.println("Name: "+ this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Location: " + this.location);
		System.out.println("Number of Posts:" + this.posts.size());
		System.out.println("Number of Friends:" + this.friends.size()+ "\n");
	}
	
	public void sendFriendRequest(User targetUser) {
		if(this.friends.size()<10 && targetUser.friends.size()<10 ) {
			this.friends.add(targetUser);
			targetUser.friends.add(this);
			System.out.println(targetUser.name + " is successfully added to the friends lists");
		}else {
			System.out.println("Maximum friends limit is reached");
		}
	}
	public static User createProfile(){
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=input.nextLine();
		System.out.println("Please enter your age: ");
		 int age=input.nextInt();
		 input.nextLine();
		System.out.println("Please enter your location: ");
		String location=input.nextLine();
		User user=new User(name,age);
		user.setLocation(location);
		allUsers.add(user);

		return user;
	}
	public static void seeTimeline(User user) {
		for(Post p: user.posts){
			p.info();
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>=0 && age<=120) {
			this.age = age;
		}
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
