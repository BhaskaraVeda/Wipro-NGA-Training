package com.example.validation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.validation.exception.ResourceNotFoundException;
import com.example.validation.model.User;

@Service
public class UserService {

    private final List<User> dummyList = new ArrayList<>();
    
    private Long idCounter = 1L;

    public User saveUSer(User user) {
        user.setId(idCounter++);   // set auto id
        dummyList.add(user);
        return user;
    }


    public List<User> getAllUsers() {
        return dummyList;
    }

    public Optional<User> getUserById(Long id) {
        return dummyList.stream()
                .filter(u -> u.getId() != null && u.getId().equals(id))
                .findFirst();
    }

    public void deleteUserById(Long id) throws ResourceNotFoundException {
        User user = getUserById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User Not Found with id: " + id));

        dummyList.remove(user);
    }

    public void updateUserById(Long id, User updatedUser) throws ResourceNotFoundException {

        User user = getUserById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User Not Found with id: " + id));

        // Full update
        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());
        user.setAge(updatedUser.getAge());
    }

    public void partialUpdateUserById(Long id, User updatedUser) throws ResourceNotFoundException {

        User user = getUserById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User Not Found with id: " + id));

        // Partial update
        if (updatedUser.getName() != null && !updatedUser.getName().isBlank()) {
            user.setName(updatedUser.getName());
        }

        if (updatedUser.getEmail() != null && !updatedUser.getEmail().isBlank()) {
            user.setEmail(updatedUser.getEmail());
        }

        if (updatedUser.getAge() != 0) {   // only update when provided
            user.setAge(updatedUser.getAge());
        }
    }
}
