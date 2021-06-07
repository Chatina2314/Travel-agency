package model;
public class Flights {
	//Attributes
	private String idFlight = "";
	private double takeoffDay = 0;
	private String origin = "";
	private String destination = "";
	private double departureTime = 0;
	private int hoursFlight = 0;
	//Relations
	private Passengers[]seatings;
	private Status status;
	//Methods
	public Flights(String pIdFlight, double pTakeoffDay, String pOrigin, String pDestination, double pDepartureTime, int pHoursFlight){
		idFlight = pIdFlight;
		takeoffDay = pTakeoffDay;
		origin = pOrigin;
		destination = pDestination;
		departureTime = pDepartureTime;
		hoursFlight = pHoursFlight;
		seatings = new Passengers[30];
	}
	public String getIdFlight() {
		return idFlight;
	}
	public void setIdFlight(String idFlight) {
		this.idFlight = idFlight;
	}
	public double getTakeoffDay() {
		return takeoffDay;
	}
	public void setTakeoffDay(double takeoffDay) {
		this.takeoffDay = takeoffDay;
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
	public int getHoursFlight() {
		return hoursFlight;
	}
	public void setHoursFlight(int hoursFlight) {
		this.hoursFlight = hoursFlight;
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
