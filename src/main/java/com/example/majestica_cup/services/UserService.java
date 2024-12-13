package com.example.majestica_cup.services;

import ma.youcode.majesticcup.entities.User;

import java.util.List;

public interface UserService {

    User create(User user);
    List<User> readAll();
}
