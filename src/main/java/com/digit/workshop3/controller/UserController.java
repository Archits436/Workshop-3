package com.digit.workshop3.controller;

import com.digit.workshop3.entity.Users;
import com.digit.workshop3.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private LibraryService libraryService;

    @PostMapping("addUser")
    public Users addUser(Users user) {
        return libraryService.addUser(user);
    }

    @GetMapping("allUsers")
    public List<Users> getAllUsers() {
        return libraryService.getAllUsers();
    }

    @GetMapping("users/{id}")
    public Optional<Users> getUserById(Long id) {
        return libraryService.getUserById(id);
    }

    @PutMapping("users/{id}/update")
    public Users updateUser(Long id, Users userDetails) {
        return libraryService.updateUser(id, userDetails);
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(Long id) {
        libraryService.deleteUser(id);
    }
}
