package com.example.customerservicerubi.controller;

import com.example.customerservicerubi.dao.UserRepository;
import com.example.customerservicerubi.entity.User;
import com.example.customerservicerubi.service.UserService;
import com.example.customerservicerubi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

@Autowired
private UserService userService;
    @PostMapping("user")
    public User addUser(@RequestBody User newUser){

        return this.userService.addUser(newUser);

    }

//    @GetMapping("user/{id}")
//    public User addUser(@PathVariable("id") Integer userId){
//
//        return this.userService.addUser(newUser);
//
//    }
}
