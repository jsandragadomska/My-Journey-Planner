package com.gadomska.myjourneyapp.user;

import com.gadomska.myjourneyapp.trip.TripDto;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Set<UserDto> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @PostMapping("/{userId}/trips")
    public TripDto createTrip(@PathVariable("userId") Long userId, @RequestBody TripDto tripDto) {
        return userService.createTrip(userId, tripDto);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam Long id) {
        userService.deleteById(id);
    }

}
