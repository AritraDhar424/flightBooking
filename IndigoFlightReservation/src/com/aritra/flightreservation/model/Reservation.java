package com.aritra.flightreservation.model;

public class Reservation extends Abstractmodel{

	private Passenger passenger;
	private Flight flight;
	private long flightId;
	
	//Business analyst need to add new fields of check in
	private int noOfBags;
	private boolean checkedIn; //initial is false

	public int getNoOfBags() {
		return noOfBags;
	}

	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	/* If we don't use this to string then only the object will be printed not its field
	 * 
	 */
	@Override
	public String toString() {
		return "Reservation [passenger=" + passenger + ", flight=" + flight + ", flightId=" + flightId + ", noOfBags="
				+ noOfBags + ", checkedIn=" + checkedIn + "]";
	}

}
