package tests;

import static org.junit.Assert.*;
import projobiekt_hotel.*;
import java.io.File;
import java.util.ArrayList;
import org.junit.Test;


public class CsvReaderTests {
	
	@Test
	public void testReadUsersList() throws Exception {
		String testFile = new File(this.getClass().getResource("/tests/resources/users.csv").getFile()).getAbsolutePath();
		CsvReader reader = new CsvReader();
		ArrayList<User> users = reader.readUsersList(testFile);
		
		assertEquals(2, users.size());
		
		User firstUser = users.get(0);
		User secondUser = users.get(1);

		assertEquals("foo@bar.pl", firstUser.mailAddress());
		assertEquals("Jan Kowalski", firstUser.name());
		assertEquals(UserRole.EMPLOYEE, firstUser.role());
		assertEquals("a@b.com", secondUser.mailAddress());
		assertEquals("Anna Nowak", secondUser.name());
		assertEquals(UserRole.GUEST, secondUser.role());
	}


	@Test
	public void testReadUserLine() throws Exception{
		CsvReader reader = new CsvReader();
		String line = "foo@bar.pl,900150983cd24fb0d6963f7d28e17f72,Stefan Batory,employee";
		User user = reader.readUserLine(line);
		
		assertEquals("foo@bar.pl", user.mailAddress());
		assertEquals("900150983cd24fb0d6963f7d28e17f72", user.passwordHash());
		assertEquals("Stefan Batory", user.name());
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
