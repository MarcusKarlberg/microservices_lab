package se.marcus.microservices.userservice.controller;

import org.springframework.web.bind.annotation.*;
import se.marcus.microservices.userservice.model.User;
import se.marcus.microservices.userservice.service.UserService;

import java.util.Collection;

@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping()
    public User create(@RequestBody User user){
        return UserService.create(user.getName(), user.getPassword(), user.getEmail());
    }

    @GetMapping()
    public Collection<User> getAll() {
        return UserService.findAll();
    }
}
