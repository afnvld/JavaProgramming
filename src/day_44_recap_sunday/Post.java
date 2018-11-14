package day_44_recap_sunday;

import java.util.Random;

public class Post {
	private String body;
	private int likes;
	private String date;
	private int postId;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
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

	public void setdate(String date) {
		this.date = date;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Post() {
		Random ran = new Random();
		int rand = ran.nextInt(3000);
		this.postId = postId + rand;
	}

	public void postInfo() {
		System.out.println("Body: " + body);
		System.out.println("Likes: " + likes);
		System.out.println("Date: " + date);
	}

}
