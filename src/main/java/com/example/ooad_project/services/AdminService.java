package com.example.ooad_project.services;

import com.example.ooad_project.entities.Admin;
import com.example.ooad_project.entities.User;
import com.example.ooad_project.repositories.AdminRepository;
import com.example.ooad_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(int id) {
        return adminRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Admin not found with id: " + id));
    }

    public void saveAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public void deleteAdminById(int id) {
        adminRepository.deleteById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void removeUser(User user) {
        userRepository.deleteById(user.getId());
    }

    public boolean loginAdmin(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public void logoutAdmin() {
        System.out.println("Admin logged out successfully.");
    }
}
