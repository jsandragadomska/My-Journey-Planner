package com.gadomska.myjourneyapp.trip;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/trips")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<TripDto> getTrips(){
        return tripService.getTrips();
    }

    @DeleteMapping
    public void deleteTrip(@RequestParam Long id) {
        tripService.deleteById(id);
    }

}
