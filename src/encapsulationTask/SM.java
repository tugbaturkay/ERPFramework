package encapsulationTask;

public class SM {
	public static void main(String[] args) {
//		Post p1=new Post("What a come back");
//		p1.info();
//		p1.editPost();
//		p1.info();
//		p1.addComment("yeah I know");
//		p1.info();
//		p1.addComment("what the heck");
//		p1.like();
//		p1.info();
		
		User james=new User("James Bond", 31);
		User lucas=new User("Lucas Podolski" , 19);
		System.out.println(james.friends.size());

		System.out.println(james.friends.size());
		System.out.println(james.friends.get(0).getName());
		
		System.out.println(lucas.friends.size());

		User adam=User.createProfile();

	}

}
