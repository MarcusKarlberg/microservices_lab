package se.marcus.microservices.userservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import se.marcus.microservices.userservice.model.User;

import java.util.Collection;

public interface UserRepository extends JpaRepository<User, Long> {
}
