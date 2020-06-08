package com.gadomska.myjourneyapp.user;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID uuid = UUID.randomUUID();
}
