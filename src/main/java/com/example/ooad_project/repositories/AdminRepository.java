package com.example.ooad_project.repositories;

import com.example.ooad_project.entities.Admin;
import com.example.ooad_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByUsername(String username);
}

