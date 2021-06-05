package model;
public class Users {
	//Attributes
	private String username = "";
	private String password = "";
	//Methods
	public Users(String pUsername, String pPassword) {
		username = pUsername;
		password = pPassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}