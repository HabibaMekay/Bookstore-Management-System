package com.example.ooad_project.controllers;

import org.springframework.ui.Model;
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
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String loginPage(Model model) {
        return "login";
    }

    @PostMapping
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        AppUser user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            switch (user.getRole()) {
                case "admin":
                    return "redirect:/admin";
                case "stocker":
                    return "redirect:/books";
                case "cashier":
                    return "redirect:/login";  // fix this later when cahsier is added
            }
        }
        model.addAttribute("error", "Invalid username or password.");
        return "login";
    }

}
