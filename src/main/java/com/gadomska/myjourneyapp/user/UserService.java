package com.gadomska.myjourneyapp.user;

import com.gadomska.myjourneyapp.trip.TripDto;
import com.gadomska.myjourneyapp.trip.TripEntity;
import com.gadomska.myjourneyapp.trip.TripService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final TripService tripService;

    public UserService(UserRepository userRepository, TripService tripService) {
        this.userRepository = userRepository;
        this.tripService = tripService;
    }

    public Set<UserDto> getUsers() {
        return mapUsers(userRepository.findAll());
    }

    public UserDto createUser(UserDto userDto) {
        UserEntity newUser = new UserEntity();
        newUser.setLogin(userDto.getLogin());
        newUser.setPassword(userDto.getPassword());
        newUser.setEmail(userDto.getEmail());
        newUser.setOriginCountry(userDto.getOriginCountry());
        newUser.setOriginCity(userDto.getOriginCity());

        return mapUser(userRepository.save(newUser));
    }

    private Set<UserDto> mapUsers(List<UserEntity> userEntities) {
        return userEntities.stream().map(this::mapUser).collect(toSet());
    }

    private UserDto mapUser(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setLogin(userEntity.getLogin());
        userDto.setPassword(userEntity.getPassword());
        userDto.setEmail(userEntity.getEmail());
        userDto.setOriginCountry(userEntity.getOriginCountry());
        userDto.setOriginCity(userEntity.getOriginCity());

        return userDto;
    }

    public TripDto createTrip(Long userId, TripDto tripDto) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        return tripService.createTrip(userEntity, tripDto);
    }

}
