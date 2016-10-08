public class User {
	
	public User(String mail, String hash) {
		this.mail = mail;
		this.hash = hash;
	}

	public String mailAddress()
	{
		return mail;
	}
	
	public String passwordHash()
	{
		return hash;
	}
	

	private String mail;
	private String hash;

	
}
