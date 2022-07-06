package com.deaddictionsystem.deaddictionsystemapp.controller;

import com.deaddictionsystem.deaddictionsystemapp.model.Patient;
import com.deaddictionsystem.deaddictionsystemapp.model.User;
import com.deaddictionsystem.deaddictionsystemapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/user-api")
public class UserController {

    private IUserService userService;

    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "adding new user");
        User nuser = userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(nuser);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>>getAllUsers(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "Getting all Users");
        List<User> users = userService.getAllUsers();
        ResponseEntity<List<User>> userResponse = new ResponseEntity(users, headers, HttpStatus.OK);
        return userResponse;
    }

    @GetMapping("/user/id/{userId}")
    ResponseEntity<User> getPatientById(@PathVariable("userId") int userId) {
        HttpHeaders headers = new HttpHeaders();
        User user = userService.getUserById(userId);
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(user);
    }
}
