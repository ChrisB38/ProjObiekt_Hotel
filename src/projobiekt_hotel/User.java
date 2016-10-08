public class User {
	
	public User(String mail, String hash, UserRole role) {
		this.mail = mail;
		this.hash = hash;
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
	
	public UserRole role()
	{
		return role;
	}
	

	private String mail;
	private String hash;
	private UserRole role;
	
}
