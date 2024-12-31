package com.example.ooad_project.entities;

import jakarta.persistence.*;

@Entity
public class Stocker extends AppUser {

    public Stocker(String name, String password, int id) {
        super(name, password, "stocker", id);
    }

    public Stocker() {

    }

    // Getters and Setters
    public String getPassword() {
        return super.getPassword();
    }

    public void setPassword(String password) {
        super.setPassword(password);
    }

    public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }

    public String getUsername() {
        return super.getUsername();
    }

    public void setUsername(String username) {
        super.setUsername(username);
    }

    public String getRole() {
        return super.getRole();
    }

    public void setRole(String role) {
        super.setRole(role);
    }

    @Override
    boolean login(String username, String password) {
        // Implement login logic
        return false;
    }

    @Override
    void logout() {
        // Implement logout logic
    }
}
