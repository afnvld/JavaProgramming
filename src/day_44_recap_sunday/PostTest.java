package day_44_recap_sunday;

public class PostTest {

	public static void main(String[] args) {
		Post p1 = new Post();
		System.out.println(p1.getPostId());
		p1.setBody("Today is a good day");
		p1.setdate("nov 11th");
		p1.postInfo();
		FacebookUser user1 = new FacebookUser("jamie32", "123");
		user1.post(p1);
		System.out.println(user1.listOfPosts.size());
		
		
		
		
	}

}
