package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import projobiekt_hotel.ListsCloud;
import projobiekt_hotel.User;
import projobiekt_hotel.UserRole;
import projobiekt_hotel.UsersManager;

public class UsersManagerTests {

	@Test
	public void testHash() throws Exception {
		assertEquals("3858f62230ac3c915f300c664312c63f", UsersManager.hash("foobar"));
		assertEquals("c06db68e819be6ec3d26c6038d8e8d1f", UsersManager.hash("test12345"));
		assertEquals("d8578edf8458ce06fbc5bb76a58c5ca4", UsersManager.hash("qwerty"));
		assertEquals("1d64dce239c4437b7736041db089e1b9", UsersManager.hash("abcdefghijklmnop"));
	}
	
	@Test
	public void testGetUserByMail(){
		ListsCloud cloud = ListsCloud.getInstance();
		ArrayList<User> users = cloud.users();
		users.clear();
		User newUser = new User("foo@bar.com", "d8578edf8458ce06fbc5bb76a58c5ca4", "Jan Kowalski", UserRole.EMPLOYEE);
		users.add(newUser);
		
		try {
			assertEquals(newUser, UsersManager.getUserByMail("foo@bar.com"));
		} catch(Exception e) {
			fail("Exception thrown");
		}
		
		try {
			User someUser = UsersManager.getUserByMail("a@b.com");
			fail("Exception not thrown");
		} catch(Exception e) {
			assertEquals("user not found", e.getMessage());
		}
		
	}
	
	@Test
	public void testLogin() throws Exception {
		ListsCloud cloud = ListsCloud.getInstance();
		ArrayList<User> users = cloud.users();
		users.clear();
		
		String plainPassword = "myPass";
		String hashedPassword = UsersManager.hash(plainPassword);
		
		User newUser = new User("foo@bar.com", hashedPassword, "Jan Kowalski", UserRole.EMPLOYEE);
		users.add(newUser);
		
		assertEquals(false, UsersManager.login("wrong@user.com", plainPassword));
		assertEquals(true, UsersManager.login("foo@bar.com", plainPassword));
		assertEquals(false, UsersManager.login("foo@bar.com", "myPas"));
	}
	
	@Test
	public void testRegister() throws Exception {
		ListsCloud cloud = ListsCloud.getInstance();
		ArrayList<User> users = cloud.users();
		users.clear();
		
		assertEquals(false, UsersManager.login("foo@bar.com", "myPass"));
		assertEquals(true, UsersManager.register("foo@bar.com", "myPass", "Jan Kowalski", "guest"));
		assertEquals(true, UsersManager.login("foo@bar.com", "myPass"));
		assertEquals(false, UsersManager.register("foo@bar.com", "otherPass", "Jan Kowalski", "guest"));
	}

}
