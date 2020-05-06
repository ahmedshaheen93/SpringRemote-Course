package com.shaheen.controller;

import com.shaheen.exception.BadRequestExpection;
import com.shaheen.exception.EntityExistException;
import com.shaheen.exception.NotFoundException;
import com.shaheen.model.User;
import com.shaheen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.findAll();
        if (!users.isEmpty()) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/{id}")
    public User getById(@Valid @PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        user = userService.save(user);
        if (user.getId() > 0) {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } else {
            throw new BadRequestExpection("user Already exists");
        }
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@Valid @RequestBody User user) {
        user = userService.save(user);
        if (user.getId() > 0) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            throw new EntityExistException("user Already exists");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity updateUser(@Valid @PathVariable("id") Long id) {
        User user = userService.findById(id);
        if (user != null) {
            userService.delete(user);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            throw new NotFoundException("user not founded");
        }
    }

}
