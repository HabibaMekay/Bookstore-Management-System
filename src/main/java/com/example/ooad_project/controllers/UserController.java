package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.AppUser;
import com.example.ooad_project.repositories.UserRepository;
import com.example.ooad_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @PostMapping
    public AppUser createUser(@RequestBody AppUser user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public AppUser getUserById(@PathVariable int id) {
        return userRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public AppUser updateUser(@PathVariable int id, @RequestBody AppUser userDetails) {
        AppUser user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setUsername(userDetails.getUsername());
            user.setPassword(userDetails.getPassword());
            return userRepository.save(user);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
    }

    // Login functionality
    @PostMapping("/login")
    public String login(@RequestBody AppUser loginDetails) {
        AppUser user = userRepository.findByUsername(loginDetails.getUsername());
        if (user != null && user.getPassword().equals(loginDetails.getPassword())) {
            return "Login successful! Welcome, " + user.getUsername();
        } else {
            return "Invalid username or password.";
        }
    }
}
