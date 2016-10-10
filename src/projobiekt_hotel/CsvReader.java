package projobiekt_hotel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CsvReader {
	private static final String separator;
	
	static {
		separator = ",";
	}
	
	
	public ArrayList<User> readUsersList(String filename)
	{
		ArrayList<User> users = new ArrayList<User>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			
			String line;
			while( (line = reader.readLine()) != null) {
				try {
					User newUser = readUserLine(line);
					users.add(newUser);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return users;
	}
	
	public User readUserLine(String line) throws Exception
	{
		String[] elements = line.split(separator);
		if(elements.length != 3){
			throw new Exception("wrong line in csv file");
		}
		
		String mailAddress = elements[0];
		String passwordHash = elements[1];
		UserRole userRole = UserRole.fromString(elements[2]);
		
		return new User(mailAddress, passwordHash, userRole);
	}

}
