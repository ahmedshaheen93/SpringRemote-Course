package com.shaheen.controller;

import com.shaheen.model.User;
import com.shaheen.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "UserService", targetNamespace = "http://service.shaheen.com")
@Component("userServiceEndpoint")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @WebMethod
    public Double getNetSalary(User user) {
        return userService.getNetSalary(user);
    }
}
