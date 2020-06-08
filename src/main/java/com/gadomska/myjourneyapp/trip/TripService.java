package com.gadomska.myjourneyapp.trip;

import org.springframework.stereotype.Service;

@Service
public class TripService{

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }
}
