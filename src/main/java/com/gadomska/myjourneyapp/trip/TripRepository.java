package com.gadomska.myjourneyapp.trip;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepository extends JpaRepository <TripEntity, Long> {

    List<TripEntity> findAllByUserId (Long userId);

}
