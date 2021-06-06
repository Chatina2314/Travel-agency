package model;
import java.util.ArrayList;
public class Agency {
	//Attributes
	private String name = "";
	//Relation
	private ArrayList<Passengers> passengers;
	private ArrayList<Flights> flights;
	//Methods
	public Agency(String pName) {
		name = pName;
		passengers = new ArrayList<Passengers>();
		flights = new ArrayList<Flights>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Passengers> getPassengers() {
		return passengers;
	}
	public void setPassengers(ArrayList<Passengers> passengers) {
		this.passengers = passengers;
	}
	public ArrayList<Flights> getFlights() {
		return flights;
	}
	public void setFlights(ArrayList<Flights> flights) {
		this.flights = flights;
	}
}
