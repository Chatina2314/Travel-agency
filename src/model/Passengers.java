package model;
public class Passengers {
	//Attributes
	private String name = "";
	private String lastName = "";
	private String id = "";
	private int phone = 0;
	private String email = "";
	private int numCompanions = 0;
	private int numLuggage = 0;
	//Methods
	public Passengers(String pName, String pLastName, String pId, int pPhone, String pEmail, int pNumCompanions, int pNumLuggage) {
		name = pName;
		lastName = pLastName;
		id = pId;
		phone = pPhone;
		email = pEmail;
		numCompanions = pNumCompanions;
		numLuggage = pNumLuggage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumCompanions() {
		return numCompanions;
	}
	public void setNumCompanions(int numCompanions) {
		this.numCompanions = numCompanions;
	}
	public int getNumLuggage() {
		return numLuggage;
	}
	public void setNumLuggage(int numLuggage) {
		this.numLuggage = numLuggage;
	}
}