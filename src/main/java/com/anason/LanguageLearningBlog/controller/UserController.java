package com.anason.LanguageLearningBlog.controller;

import com.anason.LanguageLearningBlog.dao.User;
import com.anason.LanguageLearningBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    //final is used becos only one can be created
    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){

        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity saveUser(@RequestBody User user){
        try{
            userService.saveUser(user);
        }catch(Exception error){
            return new ResponseEntity<String>(error.getMessage(),HttpStatus.CREATED);
        }
        return new ResponseEntity("Successfully created user : " + user.getFirstName() + " " + user.getLastName(),HttpStatus.CREATED);
    }


}
