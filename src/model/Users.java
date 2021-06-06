package model;
public class Users extends Passengers{
	//Attributes
	private String username = "";
	private String password = "";
	//Methods
	public Users(String pUsername, String pPassword, String name, String lastName, String id, int phone, String email, int numLuggage) {
		super(name, lastName, id, phone, email, numLuggage);
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