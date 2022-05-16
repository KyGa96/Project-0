package model;

public class UserPojo {
	private String password;
	private String username;
	
	
	public UserPojo() {
		
	}

	public UserPojo(String password, String username) {
		super();
		this.password = password;
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserPojo [password=" + password + ", username=" + username + "]";
	}

}
