package com.example.majestica_cup.services.implementations;

import lombok.RequiredArgsConstructor;
import ma.youcode.majesticcup.entities.User;
import ma.youcode.majesticcup.repositories.UserRepository;
import ma.youcode.majesticcup.services.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public User create(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }
}
