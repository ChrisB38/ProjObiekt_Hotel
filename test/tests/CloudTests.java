package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import projobiekt_hotel.*;

import org.junit.Test;

public class CloudTests {

	@Test
	public void testAddAndRemoveElement() {
		ListsCloud cloud = ListsCloud.getInstance();
		ArrayList<User> users = cloud.users();
		users.clear();
		
		ListsCloud otherCloud = ListsCloud.getInstance();
		ArrayList<User> usersFromOtherCloud = otherCloud.users();
		
		assertEquals(users, usersFromOtherCloud);
		assertEquals(0, users.size());
		assertEquals(users.size(), usersFromOtherCloud.size());
		
		User firstUser = new User("foo@bar.com", "900150983cd24fb0d6963f7d28e17f72", "Jan Kowalski", UserRole.EMPLOYEE);
		assertEquals(false, usersFromOtherCloud.contains(firstUser));

		users.add(firstUser);

		assertEquals(users, usersFromOtherCloud);
		assertEquals(1, users.size());
		assertEquals(1, usersFromOtherCloud.size());
		assertEquals(true, usersFromOtherCloud.contains(firstUser));
		
		
		ListsCloud anotherCloud = ListsCloud.getInstance();
		ArrayList<User> usersFromAnotherCloud = anotherCloud.users();
		assertEquals(users.size(), usersFromAnotherCloud.size());
		assertEquals(true, usersFromAnotherCloud.contains(firstUser));
		
		boolean success = usersFromAnotherCloud.remove(firstUser);
		assertEquals(true, success);
		assertEquals(0, users.size());
		assertEquals(0, usersFromOtherCloud.size());
	}

}
