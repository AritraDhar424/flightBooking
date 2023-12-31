package com.aritra.flightreservation.dao;

import com.aritra.flightreservation.model.Reservation;

public interface ReservationDao {
	
	Reservation bookFlight(Reservation reservation) ;
	
	Reservation checkIn(long reservationId, int noOfBags);
		
	

}
