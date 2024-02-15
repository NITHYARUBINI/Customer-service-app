package com.example.customerservicerubi.dao;

import com.example.customerservicerubi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
