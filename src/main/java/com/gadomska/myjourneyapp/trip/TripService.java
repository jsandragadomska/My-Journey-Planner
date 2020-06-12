package com.gadomska.myjourneyapp.trip;

import com.gadomska.myjourneyapp.user.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripService{

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<TripDto> getTrips() {
        return mapTrips(tripRepository.findAll());
    }

    private List<TripDto> mapTrips(List<TripEntity> tripEntities) {
        return tripEntities.stream().map(this::mapTrip).collect(Collectors.toList());
    }

    public TripDto mapTrip(TripEntity tripEntity) {
        TripDto tripDto = new TripDto();
        tripDto.setId(tripEntity.getId());
        tripDto.setCountry(tripEntity.getCountry());
        tripDto.setCity(tripEntity.getCity());
        tripDto.setFirstDay(tripEntity.getFirstDay());
        tripDto.setLastDay(tripEntity.getLastDay());

        return tripDto;
    }

    public TripDto createTrip (UserEntity userEntity, TripDto tripDto) {
        TripEntity tripEntity = new TripEntity();
        tripEntity.setCountry(tripDto.getCountry());
        tripEntity.setCity(tripDto.getCity());
        tripEntity.setFirstDay(tripDto.getFirstDay());
        tripEntity.setLastDay(tripDto.getLastDay());
        tripEntity.setUser(userEntity);

        return mapTrip(tripRepository.save(tripEntity));
    }

    public void deleteById (Long id) {
        tripRepository.deleteById(id);
    }
}
