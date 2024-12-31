package com.example.ooad_project.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)  // or @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Admin extends AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Admin(String name, String password, int id) {
        super(name, password, "admin", id);
        this.id = id;
    }

    // Default constructor needed by JPA
    public Admin() {
        super();
    }

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
        // implement admin-specific login logic here
        return false;
    }

    @Override
    void logout() {
        // implement admin-specific logout logic here
    }

    // Admin-specific methods
    public void addUser(AppUser user) {
        // implement logic to add a user
    }

    public void removeUser(AppUser user) {
        // implement logic to remove a user
    }
}
