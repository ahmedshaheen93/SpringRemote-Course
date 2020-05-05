package com.shaheen.service;

import com.shaheen.model.User;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    public Double getNetSalary(User user) {
        return user.getSalary()+user.getBounce()-user.getDeduction();
    }
}
