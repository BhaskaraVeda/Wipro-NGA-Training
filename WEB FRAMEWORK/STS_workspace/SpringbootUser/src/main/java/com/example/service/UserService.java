package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private  UserRepository userRepository;

	
	// 5. from front controller it will come here in service
	// Here you are retrieving the user object from a front controller by html and
	//setting the values in a variable first and through constructor you have passed the
	//values to a model class and then user object is ready
	
	
	public String registerUser(User user) {
		if (userRepository.userExists(user.getUsername())) {
			return "Username already exists!";
		}
		
	userRepository. saveUser(user);
	return "User registered successfully!";
	}
	
	public boolean findUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.findUser(u.getUsername(),u.getPassword());
	}

}

