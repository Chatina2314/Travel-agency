package model;
public class Flights {
	//Attributes
	private String origin = "";
	private String destination = "";
	private double departureTime = 0;
	private double arrivalTime = 0;
	//Relations
	private Passengers[]seatings;
	private Status status;
	//Methods
	public Flights(String pOrigin, String pDestination, double pDepartureTime, double pArrivalTime){
		origin = pOrigin;
		destination = pDestination;
		departureTime = pDepartureTime;
		arrivalTime = pArrivalTime;
		seatings = new Passengers[30];
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}
	public double getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(double arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Passengers[] getSeatings() {
		return seatings;
	}
	public void setSeatings(Passengers[] seatings) {
		this.seatings = seatings;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
