/**
 * 
 */
package com.ira.spring.boot.custom.validation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ira.spring.boot.custom.validation.dto.UserRequest;
import com.ira.spring.boot.custom.validation.entity.User;
import com.ira.spring.boot.custom.validation.exception.UserNotFoundException;
import com.ira.spring.boot.custom.validation.service.UserServiceImpl;

import jakarta.validation.Valid;

/**
 * 
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest request) {
        User user = userService.saveUser(request);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }

    @GetMapping("fetchAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException {
        User user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }
}
