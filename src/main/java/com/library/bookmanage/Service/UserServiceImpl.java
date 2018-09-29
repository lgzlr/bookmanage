package com.library.bookmanage.Service;

import com.library.bookmanage.Repository.UserRepository;
import com.library.bookmanage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User getUserByUserName(String userName) {

        User user =repository.getUserByUserName(userName);
        return user;

    }
}
