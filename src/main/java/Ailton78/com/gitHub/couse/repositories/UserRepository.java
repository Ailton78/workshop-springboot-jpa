package Ailton78.com.gitHub.couse.repositories;


import Ailton78.com.gitHub.couse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
