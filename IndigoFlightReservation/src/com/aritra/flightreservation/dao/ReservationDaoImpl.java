package com.aritra.flightreservation.dao;

import java.util.HashMap;

import com.aritra.flightreservation.model.Flight;
import com.aritra.flightreservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {
	
	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;   // long simple type will assign o to reservationId,  Long is wrapper type
	
	public ReservationDaoImpl() {
		flights = new HashMap<>();
		reservations = new HashMap<>();
		
		Flight flight1 = new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("IA");
		flight1.setDepartureCity("Kolkata");
		flight1.setArrivalCity("Mumbai");
		flight1.setDateAndTimeOfDeparture("28/12/2022 9PM");
		long id1 = flight1.getId();
		flights.put(id1, flight1);
		
		Flight flight2 = new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("456");
		flight2.setOperatingAirlines("IA");
		flight2.setDepartureCity("Bagdogra");
		flight2.setArrivalCity("Delhi");
		flight2.setDateAndTimeOfDeparture("30/12/2022 10PM");
		long id2 = flight2.getId();
		flights.put(id2, flight2);
		
		Flight flight3 = new Flight();
		flight3.setId(3l);
		flight3.setFlightNumber("789");
		flight3.setOperatingAirlines("Indigo");
		flight3.setDepartureCity("Mumbai");
		flight3.setArrivalCity("Delhi");
		flight3.setDateAndTimeOfDeparture("31/12/2022 9PM");
		long id3 = flight3.getId();
		flights.put(id3, flight3);
	}

	@Override
	/* when reservation coming as parameter it does not 
	 * have the unique id we are creating the unique id and 
	 * returning the reservation
	*/
	public Reservation bookFlight(Reservation reservation) {
		
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId = reservationId +1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);  // putting in the hash map
		return reservation;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {
		//we call the hashmap of reservation
		Reservation reservation = reservations.get(reservationId);
		reservation.setNoOfBags(noOfBags);
		//checkIn flag need to be set to true
		reservation.setCheckedIn(true);
		return reservation;
	}

}
