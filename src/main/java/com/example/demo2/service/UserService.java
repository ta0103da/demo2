package com.example.demo2.service;

import com.example.demo2.domain.User;

public class UserService {

    public User Save(User user){

        // UserRepository repository = new UserRepository();
        // user = repository.insert(user);

        System.out.println("UserServiceのSaveが呼ばれました。");
        return user;
    }
}
