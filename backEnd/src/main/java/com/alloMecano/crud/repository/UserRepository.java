package backEnd.src.main.java.com.alloMecano.crud.repository;

import backEnd.src.main.java.com.alloMecano.crud.controller.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Long > {
    Optional<User> findUserById(Long id);
    Optional<User> findByEmail(String email);

    void deleteUserById(Long id);
}
