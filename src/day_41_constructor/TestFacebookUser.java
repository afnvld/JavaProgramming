package day_41_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFacebookUser {
	public static void main(String[] args) {
		FacebookUser user1 = new FacebookUser("adinana", "2525");
		user1.name = "Adina";
		user1.age = 26;
		user1.numOfFriends = 4000;

		FacebookUser user2 = new FacebookUser("micky", "465$");
		user2.name = "Michael";
		user2.age = 23;
		user2.numOfFriends = 1000;

		FacebookUser user3 = new FacebookUser("Kathy", "keke123", "2536@");
		user3.age = 35;
		user3.numOfFriends = 234;

		user1.userInfo();
		FacebookUser.deleteAccount(user1);
		user2.userInfo();
		user3.userInfo();

		user1.sendFriendRequest(user2);
		user3.sendFriendRequest(user1);

		System.out.println("--------");
		FacebookUser.seeUserInfo(user3);
		user1.acceptRequests();
		user3.acceptRequests();
		System.out.println("--------");
		user3.seeFriends();
		user1.seeFriends();
	}
}
