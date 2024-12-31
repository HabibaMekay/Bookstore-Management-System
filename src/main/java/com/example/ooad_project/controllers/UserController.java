package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.AppUser;
import com.example.ooad_project.repositories.UserRepository;
import com.example.ooad_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ooad_project.entities.AppUser;
import com.example.ooad_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    // Create a new user
    @PostMapping
    public String createUser(@ModelAttribute AppUser user, Model model) {
        userRepository.save(user);
        return "redirect:/login"; // Redirect to login page after user is created
    }

    // Get user by ID (used for admin pages or other actions)
    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id, Model model) {
        AppUser user = userRepository.findById(id).orElse(null);
        model.addAttribute("user", user);
        return "userDetails"; // Return a page showing user details
    }

    // Update user information
    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @ModelAttribute AppUser userDetails, Model model) {
        AppUser user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setUsername(userDetails.getUsername());
            user.setPassword(userDetails.getPassword());
            userRepository.save(user);
            model.addAttribute("user", user);
            return "userDetails"; // Return updated user details page
        }
        return "error"; // Return error page if user not found
    }

    // Delete user by ID
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
        return "redirect:/login"; // Redirect to login page after user is deleted
    }
}
