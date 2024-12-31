package com.example.ooad_project.DTOs;

public class UserDto {
    private int id;
    private String username;
    private String role;


    public UserDto() {}

    public UserDto(int id, String username, String role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }


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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}