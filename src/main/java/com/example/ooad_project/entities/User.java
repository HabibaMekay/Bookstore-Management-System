package com.example.ooad_project.entities;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String role;
    public User(String username, String password, String role,int id) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.id = id;
    }

    public User() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    abstract boolean login(String username, String password);
    abstract void logout();
}