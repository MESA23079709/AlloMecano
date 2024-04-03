package backEnd.src.main.java.com.alloMecano.crud.services;

import backEnd.src.main.java.com.alloMecano.crud.controller.User;
import backEnd.src.main.java.com.alloMecano.crud.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService  {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
    public User addUser(User user){
        return userRepository.save(user);
    }
    public User findUserById(Long id){
        return userRepository.findUserById(id).orElseThrow(()-> new com.alloMecano.crud.services.UserNotFoundException("user by id "+id+"was not found"));
    }
    public User updateMecanicien(User user){
        return userRepository.save(user);
    }
    @Transactional
    public void deleteMecanicien(Long id){
        userRepository.deleteUserById(id);
    }
}
