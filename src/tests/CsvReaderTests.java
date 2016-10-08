package tests;

import static org.junit.Assert.*;
import projobiekt_hotel.*;
import java.io.File;
import java.util.ArrayList;
import org.junit.Test;


public class CsvReaderTests {
	
	@Test
	public void testReadUsersList() throws Exception {
		ArrayList<User> users;
		
		String testFile = new File(this.getClass().getResource("/resources/users.csv").getFile()).getAbsolutePath();
//		String testFile = "/home/maciej/prog/java/Hotel/tests/users.csv";
		CsvReader reader = new CsvReader();
		users = reader.readUsersList(testFile);
	}


	@Test
	public void testReadUserLine() throws Exception{
		CsvReader reader = new CsvReader();
		String line = "foo@bar.pl,900150983cd24fb0d6963f7d28e17f72,employee";
		User user = reader.readUserLine(line);
		
		assertEquals("foo@bar.pl", user.mailAddress());
		assertEquals("900150983cd24fb0d6963f7d28e17f72", user.passwordHash());
		assertEquals(UserRole.EMPLOYEE, user.role());
	}
	
	@Test
	public void testReadMalformedUserLine() {
		CsvReader reader = new CsvReader();
		String wrongLine = "foo@bar.pl,employee";
		
		try {
		reader.readUserLine(wrongLine);
		fail("Exception not thrown");
		} catch(Exception e) {
			assertEquals("wrong line in csv file", e.getMessage());
		}
	}	

}
