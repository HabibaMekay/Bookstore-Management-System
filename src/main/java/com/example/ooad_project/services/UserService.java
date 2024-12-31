package com.example.ooad_project.services;

import com.example.ooad_project.entities.User;
import com.example.ooad_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));
    }

    public boolean loginUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}
