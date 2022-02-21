package se.marcus.microservices.userservice.service;

import org.springframework.stereotype.Service;
import se.marcus.microservices.userservice.model.User;
import se.marcus.microservices.userservice.repository.UserRepository;

import java.util.Collection;

@Service
public class UserService {

    private static UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static User create(String name, String password, String email) {
        return userRepository.save(new User(name, password, email));
    }

    public static Collection<User> findAll() {
        return userRepository.findAll();
    }
}
