package day_44_recap_sunday;

import java.util.List;

public class FacebookApp {
	static List<FacebookUser> listOfFU;

	public static void loadUsers(List<String> names) {
		for (int i = 0; i < names.size(); i++) {
			String username = CustomData.generateUsername(names.get(i));
			String password = CustomData.generatePassword(names.get(i));
			FacebookUser user = new FacebookUser(username, password, names.get(i));
			listOfFU.add(user);
		}

	}

	public static void seeAllFacebookUsers() {
		for (FacebookUser each : listOfFU) {
			System.out.println(each);
		}
	}

	public static boolean userExists(String username) {
		for (FacebookUser r : listOfFU) {
			if (r.username.contains(username)) {
				return true;
			}
		}

		return false;
	}

	public static void addUser(FacebookUser userr) {
		for (FacebookUser user : listOfFU) {
			if (listOfFU.contains(user)) {
				System.out.println("User already exists in the system");
			} else {
				listOfFU.add(user);
			}
		}
	}

	public static void removeUser(FacebookUser a) {
		listOfFU.remove(a);
	}
}
