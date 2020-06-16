package com.gadomska.myjourneyapp.journey;

public class JourneyDto {

    //This class will contain steps of the journey - trips.
    //e.g. journey name - "polish castles" will contain certain steps (trips)

    private Long id;
    private String name;
    private Long userId;

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
