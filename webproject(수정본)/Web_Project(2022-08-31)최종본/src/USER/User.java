package USER;

public class User {
	private String userid;
	private String userpassword1;
	private String userpassword;
	private String username;
	private String userbirwrap;
	private String usergender;
	private String usernumber;
	
	public User(String userid, String userpassword1, String userpassword, String username, String userbirwrap,
			String usergender, String usernumber) {
		super();
		this.userid = userid;
		this.userpassword1 = userpassword1;
		this.userpassword = userpassword;
		this.username = username;
		this.userbirwrap = userbirwrap;
		this.usergender = usergender;
		this.usernumber = usernumber;
	}
	public User() {
		
	}
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpassword1() {
		return userpassword1;
	}

	public void setUserpassword1(String userpassword1) {
		this.userpassword1 = userpassword1;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserbirwrap() {
		return userbirwrap;
	}

	public void setUserbirwrap(String userbirwrap) {
		this.userbirwrap = userbirwrap;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public String getUsernumber() {
		return usernumber;
	}

	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userpassword1=" + userpassword1 + ", userpassword=" + userpassword
				+ ", username=" + username + ", userbirwrap=" + userbirwrap + ", usergender=" + usergender
				+ ", usernumber=" + usernumber + "]";
	}
	
	
}
