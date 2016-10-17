package projobiekt_hotel;

public class User {
	
	public User(String mail, String hash, String name, UserRole role) {
		this.mail = mail;
		this.hash = hash;
		this.name = name;
		this.role = role;
	}

	public String mailAddress()
	{
		return mail;
	}
	
	public String passwordHash()
	{
		return hash;
	}
	
	public String name()
	{
		return name;
	}
	
	public UserRole role()
	{
		return role;
	}
	

	private String mail;
	private String hash;
	private String name;
	private UserRole role;
	
}
