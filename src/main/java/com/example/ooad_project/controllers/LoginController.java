package com.example.ooad_project.controllers;

import org.springframework.ui.Model;
import com.example.ooad_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    // GET mapping for the login page (HTML form)
    @GetMapping
    public String loginPage(Model model) {
        return "login"; // This refers to the login.html template
    }

    // POST mapping for the login functionality
    @PostMapping
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        if (userService.loginUser(username, password)) {
            // If login is successful, redirect to a different page or show a success message
            return "redirect:/home";  // Redirect to home or another page after successful login
        } else {
            // If login fails, show an error message
            model.addAttribute("error", "Invalid username or password.");
            return "login";  // Show the login page again with the error message
        }
    }
}
