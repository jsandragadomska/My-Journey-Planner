package com.gadomska.myjourneyapp.trip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository <TripEntity, Long> {

    List<TripEntity> findAllByUserId (Long userId);

}
