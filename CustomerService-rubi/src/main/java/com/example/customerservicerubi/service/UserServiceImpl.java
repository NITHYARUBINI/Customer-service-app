package com.example.customerservicerubi.service;

import com.example.customerservicerubi.dao.UserRepository;
import com.example.customerservicerubi.entity.Issue;
import com.example.customerservicerubi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User newUser) {
        return this.userRepository.save(newUser);
    }

    @Override
    public User updateUserProfileById(Integer customerId) {
        return null;
    }

    @Override
    public Issue addIssue(Issue issue) {
        return null;
    }
}
