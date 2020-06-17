package com.gadomska.myjourneyapp.trip;

import com.gadomska.myjourneyapp.journey.JourneyEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TRIP")
public class TripEntity {

    @Id
    @GenericGenerator(
            name = "trip_seq_generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = @org.hibernate.annotations.Parameter(name = "sequence_name", value = "TRIP_SEQ")
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trip_seq_generator")
    private Long id;

    private UUID uuid = UUID.randomUUID();

    private String country;

    private String city;

    private LocalDate firstDay;

    private LocalDate lastDay;

    public TripEntity() {
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }

    public LocalDate getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }

    @ManyToOne
    @JoinColumn(name = "journey_id", nullable = false)
    private JourneyEntity journeyEntity;
}
