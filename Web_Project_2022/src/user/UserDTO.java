package user;

public class UserDTO {
	private String UserID;
	private String userPassword;
	private String Username;
	private String Userbir_wrap;
	private String Usergender;
	
	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	
	public UserDTO(String userID, String userPassword, String username, String userbir_wrap, String usergender) {
		super();
		UserID = userID;
		this.userPassword = userPassword;
		Username = username;
		Userbir_wrap = userbir_wrap;
		Usergender = usergender;
	}
	
	@Override
	public String toString() {
		return "UserDTO [UserID=" + UserID + ", userPassword=" + userPassword + ", Username=" + Username
				+ ", Userbir_wrap=" + Userbir_wrap + ", Usergender=" + Usergender + "]";
	}
	
	
}
