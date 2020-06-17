package com.gadomska.myjourneyapp.journey;

import com.gadomska.myjourneyapp.trip.TripDto;
import com.gadomska.myjourneyapp.trip.TripEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class JourneyDto {

    //This class will contain steps of the journey - trips.
    //e.g. journey name - "polish castles" will contain certain steps (trips)

    private Long id;
    private String name;
    private Long userId;
    private ArrayList<TripDto> trips;

    public JourneyDto(Long id, String name, Long userId) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.trips = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
