package day_41_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacebookUser {
	String username;
	int age;
	String name;
	String password;
	int numOfFriends;

	List<FacebookUser> friendsList = new ArrayList<>();
	List<FacebookUser> friendRequestList = new ArrayList<>();

	public FacebookUser(String username, String password) {
		this.username = username;
		this.password = password;

	}

	public FacebookUser(String name, String username, String password) {
		this.name = name;
		this.username = username;
		if (!password.contains(username)) {
			this.password = password;
		} else {
			System.out.println("Password can't contain username. Please change password");
			this.password = "";
		}

	}

	public void userInfo() {
		System.out.println("Name: " + name);
		System.out.println("Username: " + this.username);
		System.out.println("Age: " + this.age);
		System.out.println("Friends: " + this.numOfFriends);
	}

	public boolean sendFriendRequest(FacebookUser targetUser) {
		if (targetUser.numOfFriends < 5000) {
			targetUser.friendRequestList.add(this);
			System.out.println("Friend request sent to " + targetUser.name);
			return true;
		} else {
			System.out.println(targetUser.name + " can't accept friend request");
			return false;

		}
	}

	public void seeFriends() {
		for (FacebookUser each : friendsList) {
			each.userInfo();
		}
	}

	public void acceptRequests() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < friendRequestList.size(); i++) {
			friendRequestList.get(i).userInfo();
			System.out.println("Do you want to accept " + friendRequestList.get(i).name + " ?");
			if (scan.nextLine().equalsIgnoreCase("yes")) {
				friendsList.add(friendRequestList.get(i));
				System.out.println(friendRequestList.get(i).name + " is added to your friends list!");
			} else {
				System.out.println("We won't tell " + friendRequestList.get(i).name + " you've denied the request");
			}
		}

	}

	public static void deleteAccount(FacebookUser user) {
		user.age = 0;
		user.name = null;
		user.username = null;
		user.numOfFriends = 0;

	}

	public static void seeUserInfo(FacebookUser user) {
		user.userInfo();

	}

}
