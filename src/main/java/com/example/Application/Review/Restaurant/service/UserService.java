package com.example.Application.Review.Restaurant.service;

import com.example.Application.Review.Restaurant.entity.User;
import com.example.Application.Review.Restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public  User save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public org.springframework.security.core.userdetails.User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public String passwordEncoder() {
        return null;
    }
}
