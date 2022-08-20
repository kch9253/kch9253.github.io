package USER;

public class User {
	private String UserID;
	private String UserPassword;
	private String Username;
	private String Userbir_wrap;
	private String Usergender;
	
	public User(String userID, String userPassword, String username, String userbir_wrap, String usergender) {
		super();
		UserID = userID;
		UserPassword = userPassword;
		Username = username;
		Userbir_wrap = userbir_wrap;
		Usergender = usergender;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getUserbir_wrap() {
		return Userbir_wrap;
	}

	public void setUserbir_wrap(String userbir_wrap) {
		Userbir_wrap = userbir_wrap;
	}

	public String getUsergender() {
		return Usergender;
	}

	public void setUsergender(String usergender) {
		Usergender = usergender;
	}

	@Override
	public String toString() {
		return "User [UserID=" + UserID + ", UserPassword=" + UserPassword + ", Username=" + Username
				+ ", Userbir_wrap=" + Userbir_wrap + ", Usergender=" + Usergender + "]";
	}
	
}
