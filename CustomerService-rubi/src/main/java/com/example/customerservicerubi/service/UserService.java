package com.example.customerservicerubi.service;

import com.example.customerservicerubi.entity.Issue;
import com.example.customerservicerubi.entity.User;

public interface UserService {
    public User addUser(User newUser);
    public User updateUserProfileById(Integer customerId);

    public Issue addIssue(Issue issue);

}
