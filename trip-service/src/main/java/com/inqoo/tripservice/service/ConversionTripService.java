package com.inqoo.tripservice.service;

import com.inqoo.model.TripDTO;
import com.inqoo.tripservice.model.Trip;
import org.springframework.stereotype.Service;
@Service
public class ConversionTripService {

    public Trip convertTrip(TripDTO trip) {
        Trip trip1 = new Trip();
        trip1.setDestination(trip.getDestination());
        trip1.setPriceEur(trip.getPriceEur());
        trip1.setStart(trip.getStart());
        trip1.setEnd(trip.getEnd());
        trip1.setId(trip.getId());
        return trip1;
    }

}