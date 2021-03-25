package com.upgrad.com.techicalblogpost.service;

import com.upgrad.com.techicalblogpost.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(User user)
    {
        if(user.getUsername().equals("admin") && user.getPassword().equals("123"))
            return true;
        else
            return false;
    }
}
