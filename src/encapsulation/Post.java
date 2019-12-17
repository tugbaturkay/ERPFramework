package encapsulation;

public class Post {
	private String comments;
	private int likes;
	private String date;
	private String postBody;
	
	public Post(String postBody) {
		
		if(postBody.isEmpty()) {
			System.out.println("Post has no body");
		}else {
			this.postBody=postBody;
		}
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getDate() {
		return date;
	}
//	public void setDate(String date) {
//		this.date = date;
//	}
	public String getPostBody() {
		return postBody;
	}
	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}
	public void info() {
		System.out.println("Post Body:" + this.postBody);
		System.out.println("Date:" + date);
		System.out.println();
	}
	
	

}
