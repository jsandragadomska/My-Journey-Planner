package com.gadomska.myjourneyapp.trip;

import com.gadomska.myjourneyapp.user.UserEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
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

    private LocalDateTime firstDay;

    private LocalDateTime lastDay;

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

    public LocalDateTime getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDateTime firstDay) {
        this.firstDay = firstDay;
    }

    public LocalDateTime getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDateTime lastDay) {
        this.lastDay = lastDay;
    }

    @ManyToOne
    private UserEntity user;
}
