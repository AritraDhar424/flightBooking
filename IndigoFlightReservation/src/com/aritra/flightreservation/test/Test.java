package com.aritra.flightreservation.test;

import com.aritra.flightreservation.dao.ReservationDaoImpl;
import com.aritra.flightreservation.model.Passenger;
import com.aritra.flightreservation.model.Reservation;
import com.aritra.flightreservation.dao.ReservationDao;

public class Test {
	
	public static void main(String[] args) {
		ReservationDao dao = new ReservationDaoImpl();
		Reservation reservation = new Reservation();
		
		Passenger passenger = new Passenger();
		passenger.setId(123l);
		passenger.setFirstName("Aritra");
		passenger.setLastName("Dhar");
		passenger.setEmail("a@123.com");
		passenger.setPhone("8777043339");
		
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);
		
		
		//dao.bookFlight(reservation);
		
		Reservation savedReservation = dao.bookFlight(reservation);
		
		// now check the checkIn method
		
		dao.checkIn(savedReservation.getId(), 2);
		
		System.out.println(savedReservation);
		
		/* Before checked in
		 * Reservation [passenger=Passenger [firstName=Aritra, lastName=Dhar, middleName=null, email=a@123.com, phone=8777043339], 
		 * flight=Flight [flightNumber=123, operatingAirlines=IA, departureCity=Kolkata, arrivalCity=Mumbai, 
		 * dateAndTimeOfDeparture=28/12/2022 9PM], flightId=1, noOfBags=0, checkedIn=false]

			After checked in
           Reservation [passenger=Passenger [firstName=Aritra, lastName=Dhar, middleName=null, email=a@123.com, phone=8777043339], 
           flight=Flight [flightNumber=123, operatingAirlines=IA, departureCity=Kolkata, arrivalCity=Mumbai, 
           dateAndTimeOfDeparture=28/12/2022 9PM], flightId=1, noOfBags=2, checkedIn=true]
		 */
	}

}
