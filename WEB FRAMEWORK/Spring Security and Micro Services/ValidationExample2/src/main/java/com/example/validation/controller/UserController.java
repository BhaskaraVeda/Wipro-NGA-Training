package com.example.validation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.validation.exception.ResourceNotFoundException;
import com.example.validation.model.User;
import com.example.validation.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> saveUser(@Valid @RequestBody User u) {

        User uobj = userService.saveUSer(u);

        if (uobj != null)
            return ResponseEntity.ok("Added");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Record not added");
    }

    @GetMapping("/viewall")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) throws ResourceNotFoundException {

        Optional<User> user = userService.getUserById(id);

        if (user.isPresent())
            return ResponseEntity.ok(user.get());

        throw new ResourceNotFoundException("User Not Found with id: " + id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id)
            throws ResourceNotFoundException {

        userService.deleteUserById(id);

        return ResponseEntity.ok("The id is deleted successfully");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody User user)
            throws ResourceNotFoundException {

        userService.updateUserById(id, user);

        return ResponseEntity.ok("The data is updated successfully");
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<String> partialUpdateUser(@PathVariable Long id, @RequestBody User user)
            throws ResourceNotFoundException {

        userService.partialUpdateUserById(id, user);

        return ResponseEntity.ok("The partial data is updated successfully");
    }
}
