package projobiekt_hotel;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;

public class UsersManager {

	public static boolean login(String mail, String password) {
		try {
			User user = getUserByMail(mail);
			if(user.passwordHash().equals(hash(password)))
				return true;
			else
				return false;
		} catch(Exception e) {
			return false;
		}
	}
	
	public static boolean register(String mail, String password, String name, String role) throws Exception {
		try {
			getUserByMail(mail);
			System.out.println("Cannot register - e-mail exists in database");
			return false;
		} catch(Exception e) {
			System.out.println("Registering new user");
		}
		
		ListsCloud cloud = ListsCloud.getInstance();
		ArrayList<User> users = cloud.users();
		User newUser = new User(mail, hash(password), name, UserRole.fromString(role)); 
		users.add(newUser);
		
		return true;
	}
	
	public static boolean correctSecretPassword(String password) throws Exception {
		return hash(password).equals("ed86f1f642b7d5ea479523c8e879be29");
	}
        
 
	public static User getUserByMail(String mail) throws Exception {
		ListsCloud cloud = ListsCloud.getInstance();
		ArrayList<User> users = cloud.users();
		for (User user : users) {
			if(user.mailAddress().equals(mail))
				return user;
		}
		throw new Exception("user not found");
	}
	
	
	public static String hash(String plain) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.reset();
		md.update(plain.getBytes());
		byte[] digest = md.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		String hashedPassword = bigInt.toString(16);
		
		while(hashedPassword.length() < 32 ){
			hashedPassword = "0"+hashedPassword;
		}
		
		return hashedPassword;
	}
	
}
