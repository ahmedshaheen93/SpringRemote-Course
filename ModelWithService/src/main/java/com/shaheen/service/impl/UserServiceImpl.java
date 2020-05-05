package com.shaheen.service.impl;

import com.shaheen.model.User;
import com.shaheen.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public Double getNetSalary(User user) {
        return user.getSalary() + user.getBounce() - user.getDeduction();
    }
}
