package com.gadomska.myjourneyapp.trip;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "TRIP")
public class TripEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private UUID uuid = UUID.randomUUID();
}
