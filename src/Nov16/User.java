package Nov16;

public class User {
	public static void main(String[] args) {
		// To get the current logged in user we can use

		System.out.println("Logged in User : " + System.getProperty("user.name"));

		// to get the groups of user:

		// you need 2 jars : jna-3.5.1.jar and platform-3.5.1.jar

		Group[] groups = Netapi32Util.getUserGroups(System.getProperty("user.name"), Netapi32Util.getDCName());
		for (Group group : groups) {
			System.out.println(group.name);
		}

	}
}
