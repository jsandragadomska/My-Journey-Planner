package com.gadomska.myjourneyapp.journey;

import com.gadomska.myjourneyapp.trip.TripEntity;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "JOURNEY")
public class JourneyEntity {

    @Id
    private Long id;

    private UUID uuid = UUID.randomUUID();

    private String name;

    @OneToMany(mappedBy = "journey")
    private Set<TripEntity> trips;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TripEntity> getTrips() {
        return trips;
    }

    public void setTrips(Set<TripEntity> trips) {
        this.trips = trips;
    }
}
