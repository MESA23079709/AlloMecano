package backEnd.src.main.java.com.alloMecano.crud.controller;


import backEnd.src.main.java.com.alloMecano.crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/Users")
public class UserController {
    @Autowired
    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getALLUsers(){
        List<User> user =userService.findAllUsers();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id){
        User user=userService.findUserById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @PostMapping("/add")
        public ResponseEntity<User> addUser(@RequestBody User user){
       User userAjoute= userService.addUser(user);
        return new ResponseEntity<>(userAjoute,HttpStatus.OK) ;
        }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        userService.deleteMecanicien(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updateUser=userService.updateMecanicien(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

}
